public class Hello {
	private byte[] _array = new byte[0];
	private int _pointer = 0;
	
	public Hello() {
		movePointerRight(1);
		increaseCellValue(8);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(9);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(6);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(5);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		decreaseCellValue(1);
		outputCurrentCell();
		increaseCellValue(7);
		outputCurrentCell();
		outputCurrentCell();
		increaseCellValue(3);
		outputCurrentCell();
		movePointerRight(1);
		increaseCellValue(13);
		outputCurrentCell();
		decreaseCellValue(3);
		outputCurrentCell();
	}

	public static void main(String[] args) {
		new Hello();
	}

	private void movePointerRight(int steps) {
		_pointer += steps;
	}

	private void movePointerLeft(int steps) {
		_pointer -= steps;
		if (_pointer < 0)
			_pointer = 0;
	}

	private void increaseCellValue(int amount) {
		expandArray();
		_array[_pointer] += amount;
	}

	private void decreaseCellValue(int amount) {
		expandArray();
		_array[_pointer] -= amount;
	}

	private void expandArray() {
		if (_pointer >= _array.length) {
			byte[] newArray = new byte[_pointer + 1];
			System.arraycopy(_array, 0, newArray, 0, _array.length);
			_array = newArray;
		}
	}

	private byte getCellValue() {
		if (_pointer >= _array.length)
			return (0);
		return (_array[_pointer]);
	}

	private void outputCurrentCell() {
		System.out.print((char)(getCellValue() & 0xFF));
	}

}
