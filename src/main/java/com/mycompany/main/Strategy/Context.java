package com.mycompany.main.Strategy;



public class Context {

	private DistributionStrategy strategy;

	/**
	 * 
	 * @param strategy
	 */
	public void setStrategy(DistributionStrategy strategy) {
		// TODO - implement Context.setStrategy
		this.strategy = strategy;
	}

	public void doSomething() {
		// TODO - implement Context.doSomething
		strategy.execute();
	}

}