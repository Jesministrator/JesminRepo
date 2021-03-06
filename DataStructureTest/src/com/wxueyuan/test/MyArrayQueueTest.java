package com.wxueyuan.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wxueyuan.DataStructure.MyArrayQueue;

public class MyArrayQueueTest {

	@Test
	public void testIsEmpty() {
		MyArrayQueue<Integer> queue = new MyArrayQueue<Integer>(5);
		queue.enqueue(5);
		queue.enqueue(4);
		assertEquals(false, queue.isEmpty());
		queue.poll();
		queue.poll();
		assertEquals(true, queue.isEmpty());
	}

	@Test
	public void testEnqueue() {
		MyArrayQueue<Integer> queue = new MyArrayQueue<Integer>(5);
		queue.enqueue(5);
		queue.enqueue(4);
		queue.enqueue(3);
		assertEquals(3, queue.size());
		assertEquals(new Integer(5), queue.peek());
		queue.poll();
		assertEquals(2, queue.size());
	}

	@Test
	public void testPoll() {
		MyArrayQueue<Integer> queue = new MyArrayQueue<Integer>(5);
		queue.enqueue(5);
		queue.enqueue(4);
		assertEquals(false, queue.isEmpty());
		queue.poll();
		queue.poll();
		assertEquals(true, queue.isEmpty());
	}

	@Test
	public void testPeek() {
		MyArrayQueue<Integer> queue = new MyArrayQueue<Integer>(5);
		queue.enqueue(10);
		queue.enqueue(9);
		queue.enqueue(8);
		queue.enqueue(7);
		queue.enqueue(6);
		queue.enqueue(5);
		queue.enqueue(4);
		assertEquals(false, queue.isEmpty());
		queue.poll();
		queue.poll();
		assertEquals(new Integer(8), queue.peek());
	}

	@Test
	public void testSize() {
		MyArrayQueue<Integer> queue = new MyArrayQueue<Integer>(5);
		queue.enqueue(10);
		queue.enqueue(9);
		queue.enqueue(8);
		queue.enqueue(7);
		queue.enqueue(6);
		queue.enqueue(5);
		queue.enqueue(4);
		assertEquals(false, queue.isEmpty());
		queue.poll();
		queue.poll();
		assertEquals(new Integer(8), queue.peek());
		assertEquals(5, queue.size());
	}

}
