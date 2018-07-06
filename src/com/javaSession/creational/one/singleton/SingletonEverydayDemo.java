package com.javaSession.creational.one.singleton;

public class SingletonEverydayDemo {

	public static void main(String args[]) {

		Runtime singletonRuntime = Runtime.getRuntime();

		singletonRuntime.gc();

		System.out.println("This is singletonRuntime" + singletonRuntime);

		Runtime anotherInstance = Runtime.getRuntime();

		System.out.println("This is singletonRuntime"  + anotherInstance);

		if (singletonRuntime == anotherInstance) {
			System.out.println("They are the same instance");
		}

	}

}
