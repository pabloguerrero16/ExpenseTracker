package com.Pablo.ExpenseTracker.services.expense;

import com.Pablo.ExpenseTracker.dto.ExpenseDTO;
import com.Pablo.ExpenseTracker.entity.Expense;

import java.util.List;

public interface ExpenseService {

    Expense postExpense(ExpenseDTO expenseDTO);

    List<Expense> getAllExpenses();

    Expense getExpenseById(Long id);
}
