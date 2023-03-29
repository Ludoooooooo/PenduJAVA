package mns.java.PENDU;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    String [] liste = { "maison", "jaune", "pompier", "test", "javafxml" };
    
    @FXML
    private Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,menu;
    
    @FXML
	private TextField mot;
    
    @FXML
	private ImageView pendu;
    
    
    @FXML
    private void a() {
    	a.setDisable(true);
    }
    @FXML
    private void b() {
    	b.setDisable(true);
    }
    @FXML
    private void c() {
    	c.setDisable(true);
    }
    @FXML
    private void d() {
    	d.setDisable(true);
    }
    @FXML
    private void e() {
    	e.setDisable(true);
    }
    @FXML
    private void f() {
    	f.setDisable(true);
    }
    @FXML
    private void g() {
    	g.setDisable(true);
    }
    @FXML
    private void h() {
    	h.setDisable(true);
    }
    @FXML
    private void i() {
    	i.setDisable(true);
    }
    @FXML
    private void j() {
    	j.setDisable(true);
    }
    @FXML
    private void k() {
    	k.setDisable(true);
    }
    @FXML
    private void l() {
    	l.setDisable(true);
    }
    @FXML
    private void m() {
    	m.setDisable(true);
    }
    @FXML
    private void n() {
    	n.setDisable(true);
    }
    @FXML
    private void o() {
    	o.setDisable(true);
    }
    @FXML
    private void p() {
    	p.setDisable(true);
    }
    @FXML
    private void q() {
    	q.setDisable(true);
    }
    @FXML
    private void r() {
    	r.setDisable(true);
    }
    @FXML
    private void s() {
    	s.setDisable(true);
    }
    @FXML
    private void t() {
    	t.setDisable(true);
    }
    @FXML
    private void u() {
    	u.setDisable(true);
    }
    @FXML
    private void v() {
    	v.setDisable(true);
    }
    @FXML
    private void w() {
    	w.setDisable(true);
    }
    @FXML
    private void x() {
    	x.setDisable(true);
    }
    @FXML
    private void y() {
    	y.setDisable(true);
    }
    @FXML
    private void z() {
    	z.setDisable(true);
    	System.out.println("Lettre Z jouée");
    	
    }
 
    
    
    
}