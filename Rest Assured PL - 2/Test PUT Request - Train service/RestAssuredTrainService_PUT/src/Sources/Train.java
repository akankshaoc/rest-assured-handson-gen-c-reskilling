// Do not change the implementation

package Sources;

public class Train {
private int trainNum;
private String trainName,departCity,arrivalCity;
private String startTime,endTime;
public Train() {
	super();
}
public Train(int trainNum, String trainName, String startTime, String endTime,String departCity, String arrivalCity) {
	super();
	this.trainNum = trainNum;
	this.trainName = trainName;
	this.startTime = startTime;
	this.endTime = endTime;
	this.departCity = departCity;
	this.arrivalCity = arrivalCity;
	
}
public int getTrainNum() {
	return trainNum;
}
public void setTrainNum(int trainNum) {
	this.trainNum = trainNum;
}
public String getTrainName() {
	return trainName;
}
public void setTrainName(String trainName) {
	this.trainName = trainName;
}
public String getStartTime() {
	return startTime;
}
public void setStartTime(String startTime) {
	this.startTime = startTime;
}
public String getEndTime() {
	return endTime;
}
public void setEndTime(String endTime) {
	this.endTime = endTime;
}
public String getDepartCity() {
	return departCity;
}
public void setDepartCity(String departCity) {
	this.departCity = departCity;
}
public String getArrivalCity() {
	return arrivalCity;
}
public void setArrivalCity(String arrivalCity) {
	this.arrivalCity = arrivalCity;
}

@Override
public String toString() {
    return "Train [trainNum=" + trainNum + ", trainName=" + trainName + ", startTime=" + startTime
            + ", endTime=" + endTime + ", departCity=" + departCity + ", arrivalCity=" +  arrivalCity + "]";
}
}
