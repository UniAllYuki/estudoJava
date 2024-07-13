package entities;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Contract {

	private Integer number;
	private LocalDate period;
	private Double totalValue;
	
	private List<Installment> installments = new ArrayList<>();
	
	public Contract(Integer number, LocalDate period, Double totalValue) {
		this.number = number;
		this.period = period;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getPeriod() {
		return period;
	}

	public void setPeriod(LocalDate period) {
		this.period = period;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}	
	
	
}
