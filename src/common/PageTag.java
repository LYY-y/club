package common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class PageTag<T> extends SimpleTagSupport {
    private List<T> list;
    private PageBean<T> pb;
    private String var;

    
    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public PageBean<T> getPb() {
        return pb;
    }

    public void setPb(PageBean<T> pb) {
        this.pb = pb;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    @Override
    public void doTag() throws JspException, IOException {
        PageContext pageContext = (PageContext) this.getJspContext();
        int x = pb.getCurrPage();
        int y = pb.getTotalPage();
        if (x>pb.getTotalPage()-1){
            x=pb.getTotalPage()-1;
        }
        int begin = x*pb.getPageSize();
        int end = (x+1)*pb.getPageSize();
        if (end > list.size()){
            end = list.size();
        }
        List<T> currlist = list.subList(begin,end);
        Iterator<T> it = currlist.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            pageContext.setAttribute(var, obj);
            this.getJspBody().invoke(null);
        }
        String uri = ((HttpServletRequest)pageContext.getRequest()).getRequestURI();

        //导航条
        pageContext.getOut().println("<tr><td>");
        pageContext.getOut().println("<a href="+uri+"?currPage=0>首页</a>&nbsp;");
        if (pb.getCurrPage() < 2) {
            pageContext.getOut().println("<a href=" + uri + "?currPage=0>上一页</a>&nbsp;");
        }else {
            pageContext.getOut().println("<a href=" + uri + "?currPage="+(pb.getCurrPage()-1)+">上一页</a>&nbsp;");
        }
        for (int i = 0; i < pb.getTotalPage(); i++){
            pageContext.getOut().println("<a href=" + uri + "?currPage="+i+">"+(i+1)+"</a>&nbsp;");
        }
        if (pb.getCurrPage() > pb.getTotalPage() - 1) {
            pageContext.getOut().println("<a href=" + uri + "?currPage="+(pb.getTotalPage()-1)+">下一页</a>&nbsp;");
        }else {
            pageContext.getOut().println("<a href=" + uri + "?currPage="+(pb.getCurrPage()+1)+">下一页</a>&nbsp;");
        }
        pageContext.getOut().println("<a href="+uri+"?currPage="+(pb.getTotalPage()-1)+">末页</a>&nbsp;");
        pageContext.getOut().println("</td></tr>");
    }
}
