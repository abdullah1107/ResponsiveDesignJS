import java.util.Observable;
import java.util.Observer;

public class View implements Observer {

	@Override
	public void update(Observable o, Object arg) {

		ChangedProperty<Integer, ?> changedProperty = (ChangedProperty<Integer, ?>) arg;

		if (changedProperty.isChange(Model.ROLL)) {
			System.out.println("Roll changed: "
					+ changedProperty.getNewValue(Model.ROLL));
		}
		if (changedProperty.isChange(Model.EMAIL)) {
			System.out.println("Roll changed: "
					+ changedProperty.getNewValue(Model.EMAIL));
		}
		if (changedProperty.isChange(Model.USERNAME)) {
			System.out.println("Roll changed: "
					+ changedProperty.getNewValue(Model.USERNAME));
		}
	}

}
