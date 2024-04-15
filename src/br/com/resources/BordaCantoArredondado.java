package br.com.aplication;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.border.AbstractBorder;

public class BordaCantoArredondado extends AbstractBorder {
	private static final BasicStroke CONTORNO = new BasicStroke(2);

	@Override
	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {

		super.paintBorder(c, g, x, y, width, height);

		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setStroke(CONTORNO);

		g2d.setColor(Color.GRAY);
		g2d.drawRoundRect(x, y, width - 1, height - 1, 20, 20);

		g2d.dispose();

	}
}
