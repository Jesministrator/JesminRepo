package com.wxueyuan.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.IncludeCategories;

import com.wxueyuan.DataStructure.MySinglyLinkedList;

public class MySinglyLinkedListTest {

	@Test
	public void testSize() {
		MySinglyLinkedList<Integer> list = new MySinglyLinkedList<>();
		list.add(100);
		list.add(0,200);
		list.remove(new Integer(100));
		assertEquals(list.size(), 1);
	}

	@Test
	public void testIsEmpty() {
		MySinglyLinkedList<Integer> list = new MySinglyLinkedList<>();
		list.add(100);
		list.add(0,200);
		list.remove(new Integer(100));
		list.remove(0);
		assertEquals(list.isEmpty(), true);
	}

	@Test
	public void testContains() {
		MySinglyLinkedList<Integer> list = new MySinglyLinkedList<>();
		list.add(100);
		list.add(0,200);
		list.add(1, 300);
		list.add(400);
		list.remove(new Integer(100));
		assertEquals(list.contains(new Integer(200)), true);
		assertEquals(list.contains(new Integer(100)), false);
		assertEquals(list.contains(null), false);
	}

	@Test
	public void testAddE() {
		MySinglyLinkedList<Integer> list = new MySinglyLinkedList<>();
		list.add(100);
		list.add(0,200);
		list.add(1, 300);
		list.add(400);
		list.add(500);
		assertEquals("[200, 300, 100, 400, 500]", list.toString());
	}

	@Test
	public void testAddIntE() {
		MySinglyLinkedList<Integer> list = new MySinglyLinkedList<>();
		list.add(100);
		list.add(0,200);
		list.add(1, 300);
		list.add(400);
		list.add(500);
		list.add(3,600);
		assertEquals("[200, 300, 100, 600, 400, 500]", list.toString());
	}

	@Test
	public void testRemoveObject() {

		MySinglyLinkedList<Integer> list = new MySinglyLinkedList<>();
		list.add(100);
		list.add(0,200);
		list.add(1, 300);
		list.add(400);
		list.add(500);
		list.add(3,600);
		list.remove(new Integer(600));
		list.remove(new Integer(500));
		assertEquals("[200, 300, 100, 400]", list.toString());
	
	}

	@Test
	public void testRemoveInt() {
		MySinglyLinkedList<Integer> list = new MySinglyLinkedList<>();
		list.add(100);
		list.add(0,200);
		list.add(1, 300);
		list.add(400);
		list.add(500);
		list.add(3,600);
		list.remove(0);
		list.remove(1);
		assertEquals("[300, 600, 400, 500]", list.toString());
	}

	@Test
	public void testClear() {
		MySinglyLinkedList<Integer> list = new MySinglyLinkedList<>();
		list.add(100);
		list.add(0,200);
		list.add(1, 300);
		list.add(400);
		list.add(500);
		list.add(3,600);
		list.clear();
		assertEquals("[]", list.toString());
		assertEquals(0, list.size());
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testSet() {
		fail("Not yet implemented");
	}

}
