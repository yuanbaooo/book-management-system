//package net.jeeshop.web.action.manage.attribute_link;
//import net.jeeshop.core.BaseAction;
//import net.jeeshop.services.manage.attribute_link.Attribute_linkService;
//import net.jeeshop.services.manage.attribute_link.bean.Attribute_link;
//public class Attribute_linkAction extends BaseAction<Attribute_link> {
//private static final long serialVersionUID = 1L;
//private Attribute_linkService attribute_linkService;
//public Attribute_linkService getAttribute_linkService() {
//return attribute_linkService;
//}
//protected void selectListAfter() {
//pager.setPagerUrl("attribute_link!selectList.action");
//}
//public void setAttribute_linkService(Attribute_linkService attribute_linkService) {
//this.attribute_linkService = attribute_linkService;
//}
//public Attribute_link getE() {
//return this.e;
//}
//public void prepare() throws Exception {
//if (this.e == null) {this.e = new Attribute_link();}
//}
//public void insertAfter(Attribute_link e) {
//e.clear();
//}
//}
