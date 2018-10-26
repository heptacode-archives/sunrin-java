
public class Car {
		private String modelName;
		private int price;
		public void printInfo() {
			System.out.println("모델명은 "+modelName+"이며, 가격은"+price+"만원입니다.");
		}
		public void setModelName(String modelName) {
			this.modelName = modelName;
		}
		public void setPrice(int price) {
			price = price;
		}
}
