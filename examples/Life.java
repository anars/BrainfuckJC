public class Life {
	private byte[] _array = new byte[0];
	private int _pointer = 0;
	
	public Life() {
		increaseCellValue(1);
		movePointerRight(2);
		increaseCellValue(4);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(4);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		movePointerLeft(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			increaseCellValue(6);
			movePointerRight(1);
			decreaseCellValue(1);
		}
		increaseCellValue(1);
		while((getCellValue() & 0xFF) != 0) {
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(4);
				increaseCellValue(1);
				movePointerLeft(4);
				decreaseCellValue(1);
			}
			movePointerRight(4);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(4);
				increaseCellValue(1);
				movePointerRight(6);
				increaseCellValue(1);
				movePointerLeft(2);
				decreaseCellValue(1);
			}
			movePointerLeft(1);
			increaseCellValue(1);
			increaseCellValue(3);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				increaseCellValue(8);
				movePointerLeft(1);
				decreaseCellValue(1);
			}
			movePointerRight(1);
			outputCurrentCell();
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerLeft(1);
			increaseCellValue(3);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				increaseCellValue(3);
				movePointerLeft(1);
				decreaseCellValue(1);
			}
			movePointerRight(1);
			increaseCellValue(1);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(2);
				outputCurrentCell();
				increaseCellValue(1);
				movePointerLeft(2);
				decreaseCellValue(1);
			}
			movePointerRight(2);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerLeft(3);
			increaseCellValue(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				increaseCellValue(5);
				movePointerRight(1);
				decreaseCellValue(1);
			}
			movePointerLeft(1);
			outputCurrentCell();
			movePointerLeft(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(4);
				increaseCellValue(1);
				movePointerLeft(4);
				decreaseCellValue(1);
			}
			movePointerRight(4);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(4);
				increaseCellValue(1);
				movePointerRight(6);
				increaseCellValue(1);
				movePointerLeft(2);
				decreaseCellValue(1);
			}
			movePointerLeft(2);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(4);
				outputCurrentCell();
				increaseCellValue(1);
				movePointerLeft(3);
				increaseCellValue(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
						increaseCellValue(1);
						movePointerLeft(2);
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(5);
						increaseCellValue(8);
						increaseCellValue(3);
						movePointerLeft(3);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						increaseCellValue(1);
						movePointerRight(4);
						increaseCellValue(1);
						movePointerLeft(3);
						decreaseCellValue(1);
					}
					movePointerRight(3);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(12);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(13);
						decreaseCellValue(1);
					}
					movePointerRight(10);
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(4);
							increaseCellValue(1);
							movePointerLeft(4);
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(4);
							increaseCellValue(1);
							movePointerLeft(4);
							decreaseCellValue(1);
						}
						movePointerRight(3);
					}
					movePointerRight(3);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(3);
						increaseCellValue(1);
						movePointerRight(3);
						decreaseCellValue(1);
					}
					movePointerLeft(3);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(3);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							movePointerLeft(1);
							increaseCellValue(1);
							movePointerRight(4);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
							decreaseCellValue(1);
						}
						movePointerLeft(4);
					}
					movePointerLeft(1);
					increaseCellValue(9);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						increaseCellValue(5);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						decreaseCellValue(3);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					outputCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(17);
					decreaseCellValue(1);
				}
				increaseCellValue(10);
				outputCurrentCell();
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(1);
				decreaseCellValue(1);
			}
			movePointerRight(3);
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerLeft(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			increaseCellValue(8);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				increaseCellValue(8);
				movePointerLeft(1);
				decreaseCellValue(1);
			}
			movePointerRight(1);
			decreaseCellValue(2);
			outputCurrentCell();
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
			}
			movePointerLeft(1);
			inputIntoCurrentCell();
			decreaseCellValue(10);
			while((getCellValue() & 0xFF) != 0) {
				movePointerLeft(1);
				increaseCellValue(1);
				movePointerRight(1);
				decreaseCellValue(1);
			}
			movePointerRight(6);
			increaseCellValue(1);
			movePointerLeft(7);
			while((getCellValue() & 0xFF) != 0) {
				movePointerRight(1);
				increaseCellValue(1);
				movePointerRight(5);
				increaseCellValue(1);
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(7);
				decreaseCellValue(1);
			}
			movePointerRight(1);
			increaseCellValue(10);
			movePointerRight(5);
			while((getCellValue() & 0xFF) != 0) {
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
				inputIntoCurrentCell();
				movePointerLeft(7);
				decreaseCellValue(1);
				movePointerRight(7);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(4);
					increaseCellValue(1);
					movePointerRight(4);
					decreaseCellValue(1);
				}
				movePointerLeft(4);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(4);
					increaseCellValue(1);
					movePointerRight(1);
					increaseCellValue(1);
					movePointerLeft(5);
					decreaseCellValue(1);
				}
				movePointerRight(5);
				decreaseCellValue(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerLeft(4);
					movePointerLeft(4);
					increaseCellValue(1);
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(4);
						increaseCellValue(1);
						movePointerLeft(4);
						decreaseCellValue(1);
					}
					movePointerRight(4);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(4);
						increaseCellValue(1);
						movePointerRight(6);
						increaseCellValue(1);
						movePointerLeft(2);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						decreaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					increaseCellValue(10);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						increaseCellValue(9);
						increaseCellValue(2);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerLeft(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(4);
						increaseCellValue(1);
						movePointerLeft(4);
						decreaseCellValue(1);
					}
					movePointerRight(4);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(4);
						increaseCellValue(1);
						movePointerRight(6);
						increaseCellValue(1);
						movePointerLeft(2);
						decreaseCellValue(1);
					}
					movePointerRight(4);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
						decreaseCellValue(1);
						movePointerRight(2);
						decreaseCellValue(1);
					}
					movePointerLeft(2);
					increaseCellValue(10);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(12);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(13);
						decreaseCellValue(1);
					}
					movePointerRight(12);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(4);
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(4);
							increaseCellValue(1);
							movePointerLeft(4);
							decreaseCellValue(1);
						}
						movePointerRight(3);
					}
					movePointerRight(3);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(3);
						increaseCellValue(1);
						movePointerRight(3);
						decreaseCellValue(1);
					}
					increaseCellValue(1);
					movePointerLeft(3);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						movePointerRight(2);
						decreaseCellValue(1);
						movePointerLeft(3);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
							decreaseCellValue(1);
						}
						movePointerLeft(3);
						movePointerLeft(1);
					}
					movePointerLeft(11);
					inputIntoCurrentCell();
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
				}
				movePointerRight(1);
			}
			movePointerRight(1);
			while((getCellValue() & 0xFF) != 0) {
				decreaseCellValue(1);
				increaseCellValue(11);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					increaseCellValue(7);
					increaseCellValue(4);
					movePointerRight(1);
					increaseCellValue(11);
					movePointerLeft(2);
					decreaseCellValue(1);
				}
				movePointerRight(1);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(3);
						increaseCellValue(1);
						movePointerLeft(3);
						decreaseCellValue(1);
					}
					movePointerRight(3);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(3);
						increaseCellValue(1);
						movePointerRight(7);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(1);
						movePointerLeft(4);
						decreaseCellValue(1);
					}
					movePointerRight(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(4);
							increaseCellValue(1);
							movePointerLeft(4);
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(4);
							increaseCellValue(1);
							movePointerLeft(4);
							decreaseCellValue(1);
						}
						movePointerRight(3);
					}
					movePointerRight(3);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(3);
						increaseCellValue(1);
						movePointerRight(3);
						decreaseCellValue(1);
					}
					movePointerLeft(3);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(3);
						decreaseCellValue(1);
					}
					movePointerRight(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
							decreaseCellValue(1);
						}
						movePointerLeft(4);
					}
					movePointerLeft(2);
					movePointerLeft(6);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(3);
						increaseCellValue(1);
						movePointerLeft(3);
						decreaseCellValue(1);
					}
					movePointerRight(3);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(3);
						increaseCellValue(1);
						movePointerRight(7);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(5);
						decreaseCellValue(1);
					}
					movePointerLeft(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(2);
						increaseCellValue(1);
						movePointerLeft(2);
						decreaseCellValue(1);
					}
					movePointerRight(2);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(2);
						increaseCellValue(1);
						movePointerRight(6);
						increaseCellValue(1);
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(5);
						decreaseCellValue(1);
					}
					movePointerRight(4);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(4);
							increaseCellValue(1);
							movePointerLeft(4);
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(4);
							increaseCellValue(1);
							movePointerLeft(1);
							movePointerLeft(3);
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(4);
							increaseCellValue(1);
							movePointerLeft(4);
							decreaseCellValue(1);
						}
						movePointerRight(2);
					}
					movePointerRight(3);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						movePointerRight(1);
						increaseCellValue(1);
						movePointerLeft(1);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					while((getCellValue() & 0xFF) != 0) {
						decreaseCellValue(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(4);
							increaseCellValue(1);
							movePointerRight(4);
							decreaseCellValue(1);
						}
						movePointerLeft(3);
						movePointerLeft(1);
					}
					movePointerLeft(8);
				}
				movePointerLeft(10);
				increaseCellValue(10);
				while((getCellValue() & 0xFF) != 0) {
					movePointerRight(1);
					increaseCellValue(10);
					while((getCellValue() & 0xFF) != 0) {
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
							increaseCellValue(1);
							movePointerLeft(2);
							decreaseCellValue(1);
						}
						movePointerRight(2);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerRight(5);
							increaseCellValue(11);
							movePointerLeft(3);
							decreaseCellValue(1);
						}
						movePointerLeft(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(1);
							increaseCellValue(1);
							movePointerRight(4);
							increaseCellValue(1);
							movePointerLeft(3);
							decreaseCellValue(1);
						}
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
						}
						movePointerLeft(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerRight(5);
							increaseCellValue(1);
							movePointerLeft(8);
							decreaseCellValue(1);
						}
						movePointerRight(9);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
							increaseCellValue(1);
							movePointerLeft(2);
							decreaseCellValue(1);
						}
						movePointerRight(2);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(2);
							increaseCellValue(1);
							movePointerLeft(1);
							increaseCellValue(1);
							movePointerRight(2);
							movePointerRight(1);
							decreaseCellValue(1);
						}
						movePointerLeft(3);
						decreaseCellValue(12);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(3);
							decreaseCellValue(1);
						}
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(7);
							increaseCellValue(1);
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(4);
							movePointerLeft(1);
							decreaseCellValue(1);
						}
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(4);
								increaseCellValue(1);
								movePointerLeft(4);
								decreaseCellValue(1);
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(4);
								increaseCellValue(1);
								movePointerLeft(4);
								decreaseCellValue(1);
							}
							movePointerRight(3);
						}
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
						}
						movePointerLeft(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
							increaseCellValue(1);
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(3);
							decreaseCellValue(1);
						}
						movePointerRight(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
						}
						movePointerLeft(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(5);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerRight(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
						}
						movePointerLeft(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							movePointerRight(2);
							increaseCellValue(1);
							movePointerLeft(9);
							increaseCellValue(1);
							movePointerRight(6);
							decreaseCellValue(1);
						}
						movePointerLeft(7);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(4);
								increaseCellValue(1);
								movePointerRight(4);
								decreaseCellValue(1);
							}
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(4);
								increaseCellValue(1);
								movePointerRight(4);
								decreaseCellValue(1);
							}
							movePointerLeft(4);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(7);
							increaseCellValue(1);
							movePointerRight(7);
							decreaseCellValue(1);
						}
						movePointerLeft(9);
						increaseCellValue(11);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(1);
							movePointerRight(2);
							increaseCellValue(1);
							movePointerLeft(3);
							decreaseCellValue(1);
						}
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(7);
							increaseCellValue(1);
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(5);
							decreaseCellValue(1);
						}
						movePointerRight(4);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(4);
								increaseCellValue(1);
								movePointerLeft(4);
								decreaseCellValue(1);
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(4);
								increaseCellValue(1);
								movePointerLeft(4);
								decreaseCellValue(1);
							}
							movePointerRight(3);
						}
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
						}
						movePointerLeft(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
							increaseCellValue(1);
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(3);
							decreaseCellValue(1);
						}
						movePointerRight(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
						}
						movePointerLeft(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(5);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerRight(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
						}
						movePointerLeft(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(9);
							increaseCellValue(1);
							movePointerRight(6);
							decreaseCellValue(1);
						}
						movePointerLeft(7);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(4);
								increaseCellValue(1);
								movePointerRight(4);
								decreaseCellValue(1);
							}
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(4);
								increaseCellValue(1);
								movePointerRight(4);
								decreaseCellValue(1);
							}
							movePointerLeft(4);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(7);
							increaseCellValue(1);
							movePointerRight(7);
							decreaseCellValue(1);
						}
						movePointerLeft(9);
						increaseCellValue(11);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(7);
							increaseCellValue(1);
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(8);
							decreaseCellValue(1);
						}
						movePointerRight(7);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(4);
								increaseCellValue(1);
								movePointerLeft(4);
								decreaseCellValue(1);
							}
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(4);
								increaseCellValue(1);
								movePointerLeft(4);
								decreaseCellValue(1);
							}
							movePointerRight(3);
						}
						movePointerRight(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
						}
						movePointerLeft(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(2);
							increaseCellValue(1);
							movePointerRight(1);
							increaseCellValue(1);
							movePointerLeft(3);
							decreaseCellValue(1);
						}
						movePointerRight(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
						}
						movePointerLeft(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(2);
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(2);
							decreaseCellValue(1);
						}
						movePointerRight(7);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(3);
							increaseCellValue(1);
							movePointerRight(3);
							decreaseCellValue(1);
						}
						movePointerLeft(3);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(3);
							increaseCellValue(1);
							movePointerLeft(9);
							increaseCellValue(1);
							movePointerRight(6);
							decreaseCellValue(1);
						}
						movePointerLeft(7);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
							movePointerRight(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(4);
								increaseCellValue(1);
								movePointerRight(4);
								decreaseCellValue(1);
							}
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerLeft(4);
								increaseCellValue(1);
								movePointerRight(4);
								decreaseCellValue(1);
							}
							movePointerLeft(4);
						}
						movePointerRight(1);
						while((getCellValue() & 0xFF) != 0) {
							movePointerLeft(7);
							increaseCellValue(1);
							movePointerRight(7);
							decreaseCellValue(1);
						}
						movePointerLeft(7);
						decreaseCellValue(4);
						while((getCellValue() & 0xFF) != 0) {
							movePointerRight(7);
							increaseCellValue(1);
							movePointerLeft(7);
							increaseCellValue(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(5);
								movePointerRight(2);
								decreaseCellValue(1);
								movePointerLeft(7);
								while((getCellValue() & 0xFF) != 0) {
									decreaseCellValue(1);
								}
							}
							movePointerLeft(7);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(12);
								increaseCellValue(1);
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(13);
								decreaseCellValue(1);
							}
							while((getCellValue() & 0xFF) != 0) {
								outputCurrentCell();
								outputCurrentCell();
							}
							movePointerRight(5);
							movePointerRight(7);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								while((getCellValue() & 0xFF) != 0) {
									movePointerRight(4);
									increaseCellValue(1);
									movePointerLeft(4);
									decreaseCellValue(1);
								}
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									movePointerRight(4);
									increaseCellValue(1);
									movePointerLeft(4);
									decreaseCellValue(1);
								}
								movePointerRight(1);
								while((getCellValue() & 0xFF) != 0) {
									movePointerRight(4);
									increaseCellValue(1);
									movePointerLeft(4);
									decreaseCellValue(1);
								}
								movePointerRight(2);
							}
							movePointerRight(3);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
							}
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								movePointerRight(1);
								increaseCellValue(1);
								movePointerLeft(1);
								decreaseCellValue(1);
							}
							movePointerLeft(1);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
								while((getCellValue() & 0xFF) != 0) {
									movePointerLeft(4);
									increaseCellValue(1);
									movePointerRight(2);
									movePointerRight(2);
									decreaseCellValue(1);
								}
								movePointerLeft(4);
							}
							movePointerLeft(6);
							while((getCellValue() & 0xFF) != 0) {
								decreaseCellValue(1);
							}
						}
						movePointerLeft(7);
						while((getCellValue() & 0xFF) != 0) {
							decreaseCellValue(1);
						}
						movePointerLeft(4);
						decreaseCellValue(1);
					}
					movePointerLeft(1);
					decreaseCellValue(1);
				}
				movePointerRight(11);
				while((getCellValue() & 0xFF) != 0) {
					decreaseCellValue(1);
				}
				movePointerLeft(2);
			}
			movePointerLeft(10);
		}
	}

	public static void main(String[] args) {
		new Life();
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

	private void inputIntoCurrentCell() {
		expandArray();
		try
		{
			_array[_pointer] = (byte)System.in.read();
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}

	private void outputCurrentCell() {
		System.out.print((char)(getCellValue() & 0xFF));
	}

}
