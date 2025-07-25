---
title: CalculationData classe
second_title: Aspose.Cells for Python via .NET API Riferimenti
description:
type: docs
weight: 90
url: /it/aspose.cells/calculationdata/
is_root: false
---
##  CalculationData classe
Rappresenta i dati richiesti durante il calcolo di una funzione, come nome della funzione, parametri, ... ecc.



Il tipo CalculationData espone i seguenti membri:

###  Proprietà
| Proprietà| Descrizione|
| :- | :- |
| [calculated_value](/cells/python-net/it/aspose.cells/calculationdata/calculated_value) | Ottiene o imposta il valore calcolato per questa funzione.|
| [workbook](/cells/python-net/it/aspose.cells/calculationdata/workbook) | Ottiene l'oggetto Workbook in cui si trova la funzione.|
| [worksheet](/cells/python-net/it/aspose.cells/calculationdata/worksheet) | Ottiene l'oggetto Worksheet in cui si trova la funzione.|
| [cell_row](/cells/python-net/it/aspose.cells/calculationdata/cell_row) | Ottiene l'indice di riga della cella in cui si trova la funzione.|
| [cell_column](/cells/python-net/it/aspose.cells/calculationdata/cell_column) | Ottiene l'indice di colonna della cella in cui si trova la funzione.|
| [cell](/cells/python-net/it/aspose.cells/calculationdata/cell) |Ottiene l'oggetto Cell in cui si trova la funzione.|
| [function_name](/cells/python-net/it/aspose.cells/calculationdata/function_name) | Ottiene il nome della funzione da calcolare.|
| [param_count](/cells/python-net/it/aspose.cells/calculationdata/param_count) | Ottiene il conteggio dei parametri|


###  Metodi
| Metodo| Descrizione|
| :- | :- |
| [`get_param_value(self, index)`](/cells/python-net/it/aspose.cells/calculationdata/get_param_value/#int) |Ottiene l'oggetto valore rappresentato del parametro in corrispondenza dell'indice specificato.|
| [`get_param_value_in_array_mode(self, index, max_row_count, max_column_count)`](/cells/python-net/it/aspose.cells/calculationdata/get_param_value_in_array_mode/#int-int-int) | Ottiene il/i valore/i del parametro all'indice specificato.<br/>Se il parametro è un qualche tipo di espressione che deve essere calcolata,<br/> quindi verrà calcolato in modalità array.|
| [`get_param_text(self, index)`](/cells/python-net/it/aspose.cells/calculationdata/get_param_text/#int) | Ottiene il testo letterale del parametro in corrispondenza dell'indice specificato.|



###  Osservazioni

Tutti gli oggetti forniti da questa classe sono solo a scopo di "lettura".
L'utente non deve modificare alcun dato nella cartella di lavoro durante il processo di calcolo della formula,
In caso contrario si potrebbero verificare risultati imprevisti o eccezioni.

###  Guarda anche
* modulo [`aspose.cells`](..)
