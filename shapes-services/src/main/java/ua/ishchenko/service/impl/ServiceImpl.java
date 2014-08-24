package ua.ishchenko.service.impl;

import ua.ishchenko.service.Service;

public class ServiceImpl implements Service {
	ShapeBackEndImpl backEnd;

	@Override
	public String getShape() {
		return "Shape " + backEnd.getMaxPriority();
	}

	public void setBackEnd(ShapeBackEndImpl backEnd) {
		this.backEnd = backEnd;
	}
}
