---
title: CellsHelper.AddAddInFunction
second_title: Aspose.Cells for .NET API Reference
description: CellsHelper method. Add addin function
type: docs
url: /net/aspose.cells/cellshelper/addaddinfunction/
---
## CellsHelper.AddAddInFunction method

Add addin function.

```csharp
[Obsolete("Use WorksheetCollection.RegisterAddInFunction() methods instead.")]
[EditorBrowsable(EditorBrowsableState.Never)]
public static void AddAddInFunction(string function, int minCountOfParameters, 
    int maxCountOfParameters, ParameterType[] paramersType, ParameterType functionValueType)
```

| Parameter | Type | Description |
| --- | --- | --- |
| function | String | The function name. |
| minCountOfParameters | Int32 | Minimum number of parameters this function requires |
| maxCountOfParameters | Int32 | Maximum number of parameters this function allows. |
| paramersType | ParameterType[] | The excepted parameters type of the function |
| functionValueType | ParameterType | The function value type. |

### Remarks

NOTE: This member is now obsolete. Instead, please use WorksheetCollection.RegisterAddInFunction() methods. This method will be removed 12 months later since January 2022. Aspose apologizes for any inconvenience you may have experienced.

### See Also

* enum [ParameterType](../../parametertype/)
* class [CellsHelper](../)
* namespace [Aspose.Cells](../../../aspose.cells/)
* assembly [Aspose.Cells](../../../)


