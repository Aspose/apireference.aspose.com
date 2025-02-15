---
title: Class Protection
second_title: Aspose.Cells for .NET API Reference
description: Aspose.Cells.Protection class. Represents the various types of protection options available for a worksheet
type: docs
url: /net/aspose.cells/protection/
---
## Protection class

Represents the various types of protection options available for a worksheet.

```csharp
public class Protection
```

## Properties

| Name | Description |
| --- | --- |
| [AllowDeletingColumn](../../aspose.cells/protection/allowdeletingcolumn/) { get; set; } | Represents if the deletion of columns is allowed on a protected worksheet. |
| [AllowDeletingRow](../../aspose.cells/protection/allowdeletingrow/) { get; set; } | Represents if the deletion of rows is allowed on a protected worksheet. |
| [AllowEditingContent](../../aspose.cells/protection/alloweditingcontent/) { get; set; } | Represents if the user is allowed to edit contents of locked cells on a protected worksheet. |
| [AllowEditingObject](../../aspose.cells/protection/alloweditingobject/) { get; set; } | Represents if the user is allowed to manipulate drawing objects on a protected worksheet. |
| [AllowEditingScenario](../../aspose.cells/protection/alloweditingscenario/) { get; set; } | Represents if the user is allowed to edit scenarios on a protected worksheet. |
| [AllowFiltering](../../aspose.cells/protection/allowfiltering/) { get; set; } | Represents if the user is allowed to make use of an AutoFilter that was created before the sheet was protected. |
| [AllowFormattingCell](../../aspose.cells/protection/allowformattingcell/) { get; set; } | Represents if the formatting of cells is allowed on a protected worksheet. |
| [AllowFormattingColumn](../../aspose.cells/protection/allowformattingcolumn/) { get; set; } | Represents if the formatting of columns is allowed on a protected worksheet |
| [AllowFormattingRow](../../aspose.cells/protection/allowformattingrow/) { get; set; } | Represents if the formatting of rows is allowed on a protected worksheet |
| [AllowInsertingColumn](../../aspose.cells/protection/allowinsertingcolumn/) { get; set; } | Represents if the insertion of columns is allowed on a protected worksheet |
| [AllowInsertingHyperlink](../../aspose.cells/protection/allowinsertinghyperlink/) { get; set; } | Represents if the insertion of hyperlinks is allowed on a protected worksheet |
| [AllowInsertingRow](../../aspose.cells/protection/allowinsertingrow/) { get; set; } | Represents if the insertion of rows is allowed on a protected worksheet |
| [AllowSelectingLockedCell](../../aspose.cells/protection/allowselectinglockedcell/) { get; set; } | Represents if the user is allowed to select locked cells on a protected worksheet. |
| [AllowSelectingUnlockedCell](../../aspose.cells/protection/allowselectingunlockedcell/) { get; set; } | Represents if the user is allowed to select unlocked cells on a protected worksheet. |
| [AllowSorting](../../aspose.cells/protection/allowsorting/) { get; set; } | Represents if the sorting option is allowed on a protected worksheet. |
| [AllowUsingPivotTable](../../aspose.cells/protection/allowusingpivottable/) { get; set; } | Represents if the user is allowed to manipulate pivot tables on a protected worksheet. |
| [IsProtectedWithPassword](../../aspose.cells/protection/isprotectedwithpassword/) { get; } | Indicates whether the worksheets is protected with password. |
| [Password](../../aspose.cells/protection/password/) { get; set; } | Represents the password to protect the worksheet. |

## Methods

| Name | Description |
| --- | --- |
| [Copy](../../aspose.cells/protection/copy/)(Protection) | Copy protection info. |
| [GetPasswordHash](../../aspose.cells/protection/getpasswordhash/)() | Gets the hash of current password. |
| [VerifyPassword](../../aspose.cells/protection/verifypassword/)(string) | Verifies password. |

### Examples

```csharp

[C#]
//Instantiating a Workbook object
Workbook workbook = new Workbook();

Worksheet worksheet = workbook.Worksheets[0];
//Allowing users to select locked cells of the worksheet
worksheet.Protection.AllowSelectingLockedCell = true;
//Allowing users to select unlocked cells of the worksheet
worksheet.Protection.AllowSelectingUnlockedCell = true;  

[Visual Basic]

'Instantiating a Workbook object
Dim workbook As Workbook = New Workbook()
Dim worksheet As Worksheet = workbook.Worksheets(0)
'Allowing users to select locked cells of the worksheet
worksheet.Protection.AllowSelectingLockedCell = True
'Allowing users to select unlocked cells of the worksheet
worksheet.Protection.AllowSelectingUnlockedCell = True
```

### See Also

* namespace [Aspose.Cells](../../aspose.cells/)
* assembly [Aspose.Cells](../../)


