---
title: Cells класс
second_title: Aspose.Cells for Python via .NET API Рекомендации
description:
type: docs
weight: 190
url: /ru/aspose.cells/cells/
is_root: false
---
##  Cells класс
Инкапсулирует коллекцию объектов, связанных с ячейкой, таких как [`Cell`](/cells/python-net/ru/aspose.cells/cell), [`Row`](/cells/python-net/ru/aspose.cells/row) и т. д.



Тип Cells предоставляет следующие элементы:

###  Характеристики
| Свойство| Описание|
| :- | :- |
| [ods_cell_fields](/cells/python-net/ru/aspose.cells/cells/ods_cell_fields) | Получает список полей ods.|
| [count](/cells/python-net/ru/aspose.cells/cells/count) | Получает общее количество созданных Cell объектов.|
| [count_large](/cells/python-net/ru/aspose.cells/cells/count_large) | Получает общее количество созданных Cell объектов.|
| [rows](/cells/python-net/ru/aspose.cells/cells/rows) | Получает коллекцию из [`Row`](/cells/python-net/ru/aspose.cells/row) объектов, представляющих отдельные строки на этом листе.|
| [merged_cells](/cells/python-net/ru/aspose.cells/cells/merged_cells) | Получает коллекцию объединенных ячеек.|
| [multi_thread_reading](/cells/python-net/ru/aspose.cells/cells/multi_thread_reading) | Получает или задает, должна ли модель данных ячеек поддерживать многопоточное чтение.<br/> Значение этого свойства по умолчанию — false.|
| [memory_setting](/cells/python-net/ru/aspose.cells/cells/memory_setting) |Получает или задает параметр использования памяти для этих ячеек.|
| [style](/cells/python-net/ru/aspose.cells/cells/style) | Получает и задает стиль листа по умолчанию.|
| [standard_width_inch](/cells/python-net/ru/aspose.cells/cells/standard_width_inch) | Получает или задает ширину столбца по умолчанию на листе в дюймах.|
| [standard_width_pixels](/cells/python-net/ru/aspose.cells/cells/standard_width_pixels) | Получает или задает ширину столбца по умолчанию на листе в пикселях.|
| [standard_width](/cells/python-net/ru/aspose.cells/cells/standard_width) | Получает или задает ширину столбца по умолчанию на листе в символах.|
| [standard_height](/cells/python-net/ru/aspose.cells/cells/standard_height) | Получает или задает высоту строки по умолчанию на этом листе в точках.|
| [standard_height_pixels](/cells/python-net/ru/aspose.cells/cells/standard_height_pixels) | Получает или задает высоту строки по умолчанию на этом листе в пикселях.|
| [standard_height_inch](/cells/python-net/ru/aspose.cells/cells/standard_height_inch) | Получает или задает высоту строки по умолчанию на этом листе в дюймах.|
| [preserve_string](/cells/python-net/ru/aspose.cells/cells/preserve_string) | Получает или задает значение, указывающее, сохраняются ли все значения листа в виде строк.<br/> По умолчанию — ложь.|
| [min_row](/cells/python-net/ru/aspose.cells/cells/min_row) | Минимальный индекс строки ячейки, содержащей данные или стиль.|
| [max_row](/cells/python-net/ru/aspose.cells/cells/max_row) | Максимальный индекс строки ячейки, содержащей данные или стиль.|
| [min_column](/cells/python-net/ru/aspose.cells/cells/min_column) | Минимальный индекс столбца тех ячеек, экземпляры которых были созданы в коллекции (не включает столбец<br/>где стиль определен для всего столбца, но в нем не создана ни одна ячейка).|
| [max_column](/cells/python-net/ru/aspose.cells/cells/max_column) | Максимальный индекс столбца тех ячеек, экземпляры которых были созданы в коллекции (не включает столбец<br/>где стиль определен для всего столбца, но в нем не создана ни одна ячейка).|
| [min_data_row](/cells/python-net/ru/aspose.cells/cells/min_data_row) | Минимальный индекс строки ячейки, содержащей данные.|
| [max_data_row](/cells/python-net/ru/aspose.cells/cells/max_data_row) | Максимальный индекс строки ячейки, содержащей данные.|
| [min_data_column](/cells/python-net/ru/aspose.cells/cells/min_data_column) | Минимальный индекс столбца ячейки, содержащей данные.|
| [max_data_column](/cells/python-net/ru/aspose.cells/cells/max_data_column) | Максимальный индекс столбца ячейки, содержащей данные.|
| [is_default_row_height_matched](/cells/python-net/ru/aspose.cells/cells/is_default_row_height_matched) | Указывает, что высота строки и высота шрифта по умолчанию совпадают.|
| [is_default_row_hidden](/cells/python-net/ru/aspose.cells/cells/is_default_row_hidden) | Указывает, является ли строка скрытой по умолчанию.|
| [columns](/cells/python-net/ru/aspose.cells/cells/columns) | Получает коллекцию объектов [`Column`](/cells/python-net/ru/aspose.cells/column), представляющих отдельные столбцы на этом листе.|
| [ranges](/cells/python-net/ru/aspose.cells/cells/ranges) | Получает коллекцию из [`Range`](/cells/python-net/ru/aspose.cells/range) объектов, созданных во время выполнения.|
| [last_cell](/cells/python-net/ru/aspose.cells/cells/last_cell) | Получает последнюю ячейку на этом листе.|
| [max_display_range](/cells/python-net/ru/aspose.cells/cells/max_display_range) | Получает максимальный диапазон, включающий данные, объединенные ячейки и фигуры.|
| [first_cell](/cells/python-net/ru/aspose.cells/cells/first_cell) | Получает первую ячейку на этом листе.|


###  Методы
| Метод| Описание|
| :- | :- |
| [create_range](/cells/python-net/ru/aspose.cells/cells/create_range/#str-str) | Создает объект [`Range`](/cells/python-net/ru/aspose.cells/range) из диапазона ячеек.|
| [create_range](/cells/python-net/ru/aspose.cells/cells/create_range/#int-int-int-int) | Создает объект [`Range`](/cells/python-net/ru/aspose.cells/range) из диапазона ячеек.|
| [create_range](/cells/python-net/ru/aspose.cells/cells/create_range/#str) | Создает объект [`Range`](/cells/python-net/ru/aspose.cells/range) на основе адреса диапазона.|
| [create_range](/cells/python-net/ru/aspose.cells/cells/create_range/#int-int-bool) |Создает объект [`Range`](/cells/python-net/ru/aspose.cells/range) из строк ячеек или столбцов ячеек.|
| [get](/cells/python-net/ru/aspose.cells/cells/get/#int-int) | Добавьте API for Python через .Net.since this[int row, int columns] не поддерживается.|
| [get](/cells/python-net/ru/aspose.cells/cells/get/#str) | Добавьте API for Python через .Net.поскольку это [строковое имя ячейки] не поддерживается.|
| [import_object_array](/cells/python-net/ru/aspose.cells/cells/import_object_array/#list-int-int-bool) | Импортирует массив данных на лист.|
| [import_object_array](/cells/python-net/ru/aspose.cells/cells/import_object_array/#list-int-int-bool-int) | Импортирует массив данных на лист.|
| [import_array](/cells/python-net/ru/aspose.cells/cells/import_array/#list-int-int-bool) | Импортирует массив строк на лист.|
| [import_array](/cells/python-net/ru/aspose.cells/cells/import_array/#list-int-int-bool) | Импортирует массив целых чисел на лист.|
| [import_array](/cells/python-net/ru/aspose.cells/cells/import_array/#list-int-int-bool) | Импортирует массив double на лист.|
| [import_csv](/cells/python-net/ru/aspose.cells/cells/import_csv/#str-str-bool-int-int) | Импортируйте в ячейки файл CSV.|
| [import_csv](/cells/python-net/ru/aspose.cells/cells/import_csv/#io.RawIOBase-str-bool-int-int) | Импортируйте в ячейки файл CSV.|
| [import_csv](/cells/python-net/ru/aspose.cells/cells/import_csv/#str-aspose.cells.TxtLoadOptions-int-int) | Импортируйте в ячейки файл CSV.|
| [import_csv](/cells/python-net/ru/aspose.cells/cells/import_csv/#io.RawIOBase-aspose.cells.TxtLoadOptions-int-int) | Импортируйте в ячейки файл CSV.|
| [merge](/cells/python-net/ru/aspose.cells/cells/merge/#int-int-int-int) | Объединяет указанный диапазон ячеек в одну ячейку.|
| [merge](/cells/python-net/ru/aspose.cells/cells/merge/#int-int-int-int-bool) | Объединяет указанный диапазон ячеек в одну ячейку.|
| [merge](/cells/python-net/ru/aspose.cells/cells/merge/#int-int-int-int-bool-bool) | Объединяет указанный диапазон ячеек в одну ячейку.|
| [get_column_width_pixel](/cells/python-net/ru/aspose.cells/cells/get_column_width_pixel/#int) | Получает ширину указанного столбца в обычном представлении в пикселях.|
| [get_column_width_pixel](/cells/python-net/ru/aspose.cells/cells/get_column_width_pixel/#int-bool) | Получает ширину указанного столбца в обычном представлении в пикселях.|
| [copy_columns](/cells/python-net/ru/aspose.cells/cells/copy_columns/#aspose.cells.Cells-int-int-int-aspose.cells.PasteOptions) | Копирует данные и форматы всего столбца.|
| [copy_columns](/cells/python-net/ru/aspose.cells/cells/copy_columns/#aspose.cells.Cells-int-int-int) | Копирует данные и форматы всего столбца.|
| [copy_columns](/cells/python-net/ru/aspose.cells/cells/copy_columns/#aspose.cells.Cells-int-int-int-int) | Копирует данные и форматы целых столбцов.|
| [copy_rows](/cells/python-net/ru/aspose.cells/cells/copy_rows/#aspose.cells.Cells-int-int-int) | Копирует данные и форматы некоторых целых строк.|
| [copy_rows](/cells/python-net/ru/aspose.cells/cells/copy_rows/#aspose.cells.Cells-int-int-int-aspose.cells.CopyOptions) | Копирует данные и форматы некоторых целых строк.|
| [copy_rows](/cells/python-net/ru/aspose.cells/cells/copy_rows/#aspose.cells.Cells-int-int-int-aspose.cells.CopyOptions-aspose.cells.PasteOptions) | Копирует данные и форматы некоторых целых строк.|
| [group_columns](/cells/python-net/ru/aspose.cells/cells/group_columns/#int-int) | Группирует столбцы.|
| [group_columns](/cells/python-net/ru/aspose.cells/cells/group_columns/#int-int-bool) | Группирует столбцы.|
| [ungroup_rows](/cells/python-net/ru/aspose.cells/cells/ungroup_rows/#int-int-bool) | Разгруппирует строки.|
| [ungroup_rows](/cells/python-net/ru/aspose.cells/cells/ungroup_rows/#int-int) | Разгруппирует строки.|
| [group_rows](/cells/python-net/ru/aspose.cells/cells/group_rows/#int-int-bool) | Группы строк.|
| [group_rows](/cells/python-net/ru/aspose.cells/cells/group_rows/#int-int) | Группы строк.|
| [delete_column](/cells/python-net/ru/aspose.cells/cells/delete_column/#int-bool) | Удаляет столбец.|
| [delete_column](/cells/python-net/ru/aspose.cells/cells/delete_column/#int) | Удаляет столбец.|
| [delete_row](/cells/python-net/ru/aspose.cells/cells/delete_row/#int) | Удаляет строку.|
| [delete_row](/cells/python-net/ru/aspose.cells/cells/delete_row/#int-bool) | Удаляет строку.|
| [delete_rows](/cells/python-net/ru/aspose.cells/cells/delete_rows/#int-int) | Удаляет несколько строк.|
| [delete_rows](/cells/python-net/ru/aspose.cells/cells/delete_rows/#int-int-bool) | Удаляет несколько строк на листе.|
| [delete_blank_columns](/cells/python-net/ru/aspose.cells/cells/delete_blank_columns/#) |Удалите все пустые столбцы, не содержащие никаких данных.|
| [delete_blank_columns](/cells/python-net/ru/aspose.cells/cells/delete_blank_columns/#aspose.cells.DeleteOptions) |Удалите все пустые столбцы, не содержащие никаких данных.|
| [delete_blank_rows](/cells/python-net/ru/aspose.cells/cells/delete_blank_rows/#) | Удалите все пустые строки, которые не содержат никаких данных или других объектов.|
| [delete_blank_rows](/cells/python-net/ru/aspose.cells/cells/delete_blank_rows/#aspose.cells.DeleteOptions) | Удалите все пустые строки, которые не содержат никаких данных или других объектов.|
| [insert_columns](/cells/python-net/ru/aspose.cells/cells/insert_columns/#int-int) | Вставляет несколько столбцов в рабочий лист.|
| [insert_columns](/cells/python-net/ru/aspose.cells/cells/insert_columns/#int-int-bool) | Вставляет несколько столбцов в рабочий лист.|
| [insert_column](/cells/python-net/ru/aspose.cells/cells/insert_column/#int-bool) | Вставляет новый столбец в рабочий лист.|
| [insert_column](/cells/python-net/ru/aspose.cells/cells/insert_column/#int) | Вставляет новый столбец в рабочий лист.|
| [insert_rows](/cells/python-net/ru/aspose.cells/cells/insert_rows/#int-int-bool) | Вставляет несколько строк в рабочий лист.|
| [insert_rows](/cells/python-net/ru/aspose.cells/cells/insert_rows/#int-int-aspose.cells.InsertOptions) | Вставляет несколько строк в рабочий лист.|
| [insert_rows](/cells/python-net/ru/aspose.cells/cells/insert_rows/#int-int) | Вставляет несколько строк в рабочий лист.|
| [clear_range](/cells/python-net/ru/aspose.cells/cells/clear_range/#aspose.cells.CellArea) | Очищает содержимое и форматирование диапазона.|
| [clear_range](/cells/python-net/ru/aspose.cells/cells/clear_range/#int-int-int-int) | Очищает содержимое и форматирование диапазона.|
| [clear_contents](/cells/python-net/ru/aspose.cells/cells/clear_contents/#aspose.cells.CellArea) | Очищает содержимое диапазона.|
| [clear_contents](/cells/python-net/ru/aspose.cells/cells/clear_contents/#int-int-int-int) | Очищает содержимое диапазона.|
| [clear_formats](/cells/python-net/ru/aspose.cells/cells/clear_formats/#aspose.cells.CellArea) | Очищает форматирование диапазона.|
| [clear_formats](/cells/python-net/ru/aspose.cells/cells/clear_formats/#int-int-int-int) | Очищает форматирование диапазона.|
| [find](/cells/python-net/ru/aspose.cells/cells/find/#any-aspose.cells.Cell) | Находит ячейку, содержащую входной объект.|
| [find](/cells/python-net/ru/aspose.cells/cells/find/#any-aspose.cells.Cell-aspose.cells.FindOptions) | Находит ячейку, содержащую входной объект.|
| [end_cell_in_row](/cells/python-net/ru/aspose.cells/cells/end_cell_in_row/#int) | Получает последнюю ячейку в этой строке.|
| [end_cell_in_row](/cells/python-net/ru/aspose.cells/cells/end_cell_in_row/#int-int-int-int) | Получает последнюю ячейку с максимальным индексом строки в этом диапазоне.|
| [end_cell_in_column](/cells/python-net/ru/aspose.cells/cells/end_cell_in_column/#int) | Получает последнюю ячейку в этом столбце.|
| [end_cell_in_column](/cells/python-net/ru/aspose.cells/cells/end_cell_in_column/#int-int-int-int) | Получает последнюю ячейку с максимальным индексом столбца в этом диапазоне.|
| [insert_range](/cells/python-net/ru/aspose.cells/cells/insert_range/#aspose.cells.CellArea-int-aspose.cells.ShiftType-bool) | Вставляет диапазон ячеек и сдвигает ячейки в соответствии с параметром сдвига.|
| [insert_range](/cells/python-net/ru/aspose.cells/cells/insert_range/#aspose.cells.CellArea-aspose.cells.ShiftType) | Вставляет диапазон ячеек и сдвигает ячейки в соответствии с параметром сдвига.|
| [insert_range](/cells/python-net/ru/aspose.cells/cells/insert_range/#aspose.cells.CellArea-int-aspose.cells.ShiftType) | Вставляет диапазон ячеек и сдвигает ячейки в соответствии с параметром сдвига.|
| [import_custom_objects](/cells/python-net/ru/aspose.cells/cells/import_custom_objects/#list-list-bool-int-int-int-bool-str-bool) | Импортирует пользовательские объекты.|
| [import_custom_objects](/cells/python-net/ru/aspose.cells/cells/import_custom_objects/#list-int-int-aspose.cells.ImportTableOptions) | Импортирует пользовательские объекты.|
| [subtotal](/cells/python-net/ru/aspose.cells/cells/subtotal/#aspose.cells.CellArea-int-aspose.cells.ConsolidationFunction-list) | Создает промежуточные итоги для диапазона.|
| [subtotal](/cells/python-net/ru/aspose.cells/cells/subtotal/#aspose.cells.CellArea-int-aspose.cells.ConsolidationFunction-list-bool-bool-bool) | Создает промежуточные итоги для диапазона.|
| [remove_duplicates](/cells/python-net/ru/aspose.cells/cells/remove_duplicates/#) | Удаляет повторяющиеся строки на листе.|
| [remove_duplicates](/cells/python-net/ru/aspose.cells/cells/remove_duplicates/#int-int-int-int) | Удаляет повторяющиеся значения в диапазоне.|
| [remove_duplicates](/cells/python-net/ru/aspose.cells/cells/remove_duplicates/#int-int-int-int-bool-list) | Удаляет повторяющиеся данные диапазона.|
| [get_row_enumerator](/cells/python-net/ru/aspose.cells/cells/get_row_enumerator/#) | Получает перечислитель строк.|
| [get_merged_areas](/cells/python-net/ru/aspose.cells/cells/get_merged_areas/#) |Получает все объединенные ячейки.|
| [get_cell](/cells/python-net/ru/aspose.cells/cells/get_cell/#int-int) | Получает элемент [`Cell`](/cells/python-net/ru/aspose.cells/cell) или значение NULL по указанному индексу строки ячейки и индексу столбца.|
| [get_row](/cells/python-net/ru/aspose.cells/cells/get_row/#int) | Получает элемент [`Row`](/cells/python-net/ru/aspose.cells/row) по указанному индексу строки ячейки.|
| [check_cell](/cells/python-net/ru/aspose.cells/cells/check_cell/#int-int) | Получает элемент [`Cell`](/cells/python-net/ru/aspose.cells/cell) или значение NULL по указанному индексу строки ячейки и индексу столбца.|
| [check_row](/cells/python-net/ru/aspose.cells/cells/check_row/#int) | Получает элемент [`Row`](/cells/python-net/ru/aspose.cells/row) или значение NULL по указанному индексу строки ячейки.|
| [check_column](/cells/python-net/ru/aspose.cells/cells/check_column/#int) | Получает элемент [`Column`](/cells/python-net/ru/aspose.cells/column) или значение NULL по указанному индексу столбца.|
| [is_row_hidden](/cells/python-net/ru/aspose.cells/cells/is_row_hidden/#int) | Проверяет, скрыта ли строка по данному индексу.|
| [is_column_hidden](/cells/python-net/ru/aspose.cells/cells/is_column_hidden/#int) | Проверяет, скрыт ли столбец по данному индексу.|
| [add_range](/cells/python-net/ru/aspose.cells/cells/add_range/#aspose.cells.Range) | Добавляет ссылку на объект диапазона в ячейки.|
| [clear](/cells/python-net/ru/aspose.cells/cells/clear/#) | Очищает все данные рабочего листа.|
| [import_data](/cells/python-net/ru/aspose.cells/cells/import_data/#aspose.cells.ICellsDataTable-int-int-aspose.cells.ImportTableOptions) | Импортируйте данные из пользовательской таблицы данных.|
| [import_array_list](/cells/python-net/ru/aspose.cells/cells/import_array_list/#list-int-int-bool) | Импортирует массив данных на лист.|
| [import_formula_array](/cells/python-net/ru/aspose.cells/cells/import_formula_array/#list-int-int-bool) | Импортирует массив формул на лист.|
| [text_to_columns](/cells/python-net/ru/aspose.cells/cells/text_to_columns/#int-int-int-aspose.cells.TxtLoadOptions) | Разбивает текст в столбце на столбцы.|
| [un_merge](/cells/python-net/ru/aspose.cells/cells/un_merge/#int-int-int-int) | Разъединяет указанный диапазон объединенных ячеек.|
| [clear_merged_cells](/cells/python-net/ru/aspose.cells/cells/clear_merged_cells/#) | Очищает все объединенные диапазоны.|
| [hide_row](/cells/python-net/ru/aspose.cells/cells/hide_row/#int) | Скрывает строку.|
| [unhide_row](/cells/python-net/ru/aspose.cells/cells/unhide_row/#int-float) | Отображает строку.|
| [hide_rows](/cells/python-net/ru/aspose.cells/cells/hide_rows/#int-int) | Скрывает несколько строк.|
| [unhide_rows](/cells/python-net/ru/aspose.cells/cells/unhide_rows/#int-int-float) | Отображает скрытые строки.|
| [set_row_height_pixel](/cells/python-net/ru/aspose.cells/cells/set_row_height_pixel/#int-int) | Устанавливает высоту строки в пикселях.|
| [set_row_height_inch](/cells/python-net/ru/aspose.cells/cells/set_row_height_inch/#int-float) | Устанавливает высоту строки в дюймах.|
| [set_row_height](/cells/python-net/ru/aspose.cells/cells/set_row_height/#int-float) |Устанавливает высоту указанной строки.|
| [get_row_original_height_point](/cells/python-net/ru/aspose.cells/cells/get_row_original_height_point/#int) | Получает высоту исходной строки в единицах измерения, если строка скрыта.|
| [hide_column](/cells/python-net/ru/aspose.cells/cells/hide_column/#int) | Скрывает столбец.|
| [unhide_column](/cells/python-net/ru/aspose.cells/cells/unhide_column/#int-float) | Отображение столбца|
| [hide_columns](/cells/python-net/ru/aspose.cells/cells/hide_columns/#int-int) | Скрыть несколько столбцов.|
| [unhide_columns](/cells/python-net/ru/aspose.cells/cells/unhide_columns/#int-int-float) | Показать несколько столбцов.|
| [get_row_height](/cells/python-net/ru/aspose.cells/cells/get_row_height/#int) | Получает высоту указанной строки в точках.|
| [get_view_row_height](/cells/python-net/ru/aspose.cells/cells/get_view_row_height/#int) | Получает высоту указанной строки.|
| [get_row_height_pixel](/cells/python-net/ru/aspose.cells/cells/get_row_height_pixel/#int) | Получает высоту указанной строки в пикселях.|
| [get_row_height_inch](/cells/python-net/ru/aspose.cells/cells/get_row_height_inch/#int) | Получает высоту указанной строки в дюймах.|
| [get_view_row_height_inch](/cells/python-net/ru/aspose.cells/cells/get_view_row_height_inch/#int) | Получает высоту указанной строки в дюймах.|
| [set_column_width_pixel](/cells/python-net/ru/aspose.cells/cells/set_column_width_pixel/#int-int) | Устанавливает ширину столбца в пикселях в обычном режиме.|
| [set_column_width_inch](/cells/python-net/ru/aspose.cells/cells/set_column_width_inch/#int-float) | Устанавливает ширину столбца в дюймах в обычном режиме.|
| [set_column_width](/cells/python-net/ru/aspose.cells/cells/set_column_width/#int-float) | Устанавливает ширину указанного столбца в обычном виде.|
| [get_column_width_inch](/cells/python-net/ru/aspose.cells/cells/get_column_width_inch/#int) | Получает ширину указанного столбца в обычном представлении в дюймах.|
| [get_column_width](/cells/python-net/ru/aspose.cells/cells/get_column_width/#int) | Получает ширину (в символах) указанного столбца в обычном представлении.|
| [get_view_column_width_pixel](/cells/python-net/ru/aspose.cells/cells/get_view_column_width_pixel/#int) | Получите ширину в другом типе представления.|
| [set_view_column_width_pixel](/cells/python-net/ru/aspose.cells/cells/set_view_column_width_pixel/#int-int) | Устанавливает ширину столбца в другом представлении.|
| [get_last_data_row](/cells/python-net/ru/aspose.cells/cells/get_last_data_row/#int) | Получает индекс последней строки ячейки, содержащей данные в указанном столбце.|
| [apply_column_style](/cells/python-net/ru/aspose.cells/cells/apply_column_style/#int-aspose.cells.Style-aspose.cells.StyleFlag) |Применяет форматы для всего столбца.|
| [apply_row_style](/cells/python-net/ru/aspose.cells/cells/apply_row_style/#int-aspose.cells.Style-aspose.cells.StyleFlag) | Применяет форматы для всей строки.|
| [apply_style](/cells/python-net/ru/aspose.cells/cells/apply_style/#aspose.cells.Style-aspose.cells.StyleFlag) | Применяет форматы ко всему листу.|
| [copy_column](/cells/python-net/ru/aspose.cells/cells/copy_column/#aspose.cells.Cells-int-int) | Копирует данные и форматы всего столбца.|
| [copy_row](/cells/python-net/ru/aspose.cells/cells/copy_row/#aspose.cells.Cells-int-int) | Копирует данные и форматы целой строки.|
| [get_grouped_row_outline_level](/cells/python-net/ru/aspose.cells/cells/get_grouped_row_outline_level/#int) | Получает уровень структуры (отсчитываемый от нуля) строки.|
| [get_grouped_column_outline_level](/cells/python-net/ru/aspose.cells/cells/get_grouped_column_outline_level/#int) | Получает уровень структуры (отсчет от нуля) столбца.|
| [get_max_grouped_column_outline_level](/cells/python-net/ru/aspose.cells/cells/get_max_grouped_column_outline_level/#) | Получает максимальный уровень структуры сгруппированных столбцов (отсчитывается от нуля).|
| [get_max_grouped_row_outline_level](/cells/python-net/ru/aspose.cells/cells/get_max_grouped_row_outline_level/#) | Получает максимальный уровень структуры сгруппированных строк (отсчет от нуля).|
| [show_group_detail](/cells/python-net/ru/aspose.cells/cells/show_group_detail/#bool-int) | Разворачивает сгруппированные строки/столбцы.|
| [hide_group_detail](/cells/python-net/ru/aspose.cells/cells/hide_group_detail/#bool-int) | Сворачивает сгруппированные строки/столбцы.|
| [ungroup_columns](/cells/python-net/ru/aspose.cells/cells/ungroup_columns/#int-int) | Разгруппирует столбцы.|
| [delete_columns](/cells/python-net/ru/aspose.cells/cells/delete_columns/#int-int-bool) | Удаляет несколько столбцов.|
| [is_deleting_range_enabled](/cells/python-net/ru/aspose.cells/cells/is_deleting_range_enabled/#int-int-int-int) | Проверьте, можно ли удалить диапазон.|
| [is_blank_column](/cells/python-net/ru/aspose.cells/cells/is_blank_column/#int) | Проверяет, является ли данный столбец пустым (не содержит данных).|
| [insert_row](/cells/python-net/ru/aspose.cells/cells/insert_row/#int) | Вставляет новую строку в рабочий лист.|
| [link_to_xml_map](/cells/python-net/ru/aspose.cells/cells/link_to_xml_map/#str-int-int-str) | Ссылка на XML-карту.|
| [move_range](/cells/python-net/ru/aspose.cells/cells/move_range/#aspose.cells.CellArea-int-int) | Перемещает диапазон.|
| [insert_cut_cells](/cells/python-net/ru/aspose.cells/cells/insert_cut_cells/#aspose.cells.Range-int-int-aspose.cells.ShiftType) | Вставить диапазон вырезания.|
| [delete_range](/cells/python-net/ru/aspose.cells/cells/delete_range/#int-int-int-int-aspose.cells.ShiftType) | Удаляет диапазон ячеек и сдвигает ячейки в соответствии с параметром сдвига.|
| [retrieve_subtotal_setting](/cells/python-net/ru/aspose.cells/cells/retrieve_subtotal_setting/#aspose.cells.CellArea) | Получает настройку промежуточных итогов диапазона.|
| [remove_formulas](/cells/python-net/ru/aspose.cells/cells/remove_formulas/#) | Удаляет всю формулу и заменяет ее значением.|
| [convert_string_to_numeric_value](/cells/python-net/ru/aspose.cells/cells/convert_string_to_numeric_value/#) |Преобразует все строковые данные на листе в числовое значение, если это возможно.|
| [get_dependents](/cells/python-net/ru/aspose.cells/cells/get_dependents/#bool-int-int) | Получите все ячейки, которые относятся к определенной ячейке.|
| [get_dependents_in_calculation](/cells/python-net/ru/aspose.cells/cells/get_dependents_in_calculation/#int-int-bool) | Получает все ячейки, результат вычисления которых зависит от конкретной ячейки.|
| [get_cell_style](/cells/python-net/ru/aspose.cells/cells/get_cell_style/#int-int) | Получить стиль данной ячейки.|



###  Примечания



###  Смотрите также
* модуль [`aspose.cells`](..)
* класс [`Cell`](/cells/python-net/ru/aspose.cells/cell)
* класс [`Column`](/cells/python-net/ru/aspose.cells/column)
* класс [`Range`](/cells/python-net/ru/aspose.cells/range)
* класс [`Row`](/cells/python-net/ru/aspose.cells/row)
