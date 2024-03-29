---
title: GetDependents
second_title: Справочник по Aspose.Cells для .NET API
description: Получить все ячейки формула которых напрямую ссылается на эту ячейку.
type: docs
weight: 380
url: /ru/net/aspose.cells/cell/getdependents/
---
## Cell.GetDependents method

Получить все ячейки, формула которых напрямую ссылается на эту ячейку.

```csharp
public Cell[] GetDependents(bool isAll)
```

| Параметр | Тип | Описание |
| --- | --- | --- |
| isAll | Boolean | Указывает, следует ли проверять формулы на других листах. |

### Примечания

Если одна ссылка, содержащая эту ячейку, появляется в формуле одной ячейки, эта ячейка будет принята как зависимая от этой ячейки, независимо от того, используется ссылка или эта ячейка при расчете. Например, хотя ячейка A2 в формуле "=IF (TRUE,A1,A2)" не используется при расчете, эта формула по-прежнему принимается как зависимая от A2.  Чтобы получить те формулы, результаты расчетов которых зависят от этой ячейки, используйте[`GetDependentsInCalculation`](../getdependentsincalculation). При отслеживании иждивенцев для одной ячейки все формулы в рабочей книге или рабочем листе будут проанализированы и проверены. Таким образом, это процесс, требующий времени. Если пользователю необходимо отследить зависимые элементы для большого количества ячеек, использование этого метода приведет к снижению производительности. Из соображений производительности пользователь должен использовать[`GetDependentsInCalculation`](../getdependentsincalculation) вместо этого. Или пользователь может собрать карту прецедентов всех ячеек с помощью[`GetPrecedents`](../getprecedents)во-первых, , а затем построить карту зависимостей в соответствии с картой прецедентов.

### Примеры

```csharp
[C#]

Workbook workbook = new Workbook();
Cells cells = workbook.Worksheets[0].Cells;
cells["A1"].Formula = "=B1+SUM(B1:B10)+[Book1.xls]Sheet1!B2";
cells["A2"].Formula = "=IF(TRUE,B2,B1)";
Cell[] dependents = cells["B1"].GetDependents(true);
for (int i = 0; i < dependents.Length; i++)
{
     Console.WriteLine(dependents[i].Name);
}
```

### Смотрите также

* class [Cell](../../cell)
* пространство имен [Aspose.Cells](../../cell)
* сборка [Aspose.Cells](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->
