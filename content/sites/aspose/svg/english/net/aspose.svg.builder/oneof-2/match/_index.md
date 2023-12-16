---
title: OneOf-2.Match
second_title: Aspose.SVG for .NET API Reference
description: OneOf method. Executes one of the provided functions based on the underlying type of the value
type: docs
weight: 20
url: /net/aspose.svg.builder/oneof-2/match/
---
## OneOf&lt;T1,T2&gt;.Match&lt;TResult&gt; method

Executes one of the provided functions based on the underlying type of the value.

```csharp
public TResult Match<TResult>(Func<T1, TResult> func1, Func<T2, TResult> func2)
```

| Parameter | Description |
| --- | --- |
| TResult | The return type of the functions. |
| func1 | The function to execute if the value is of type T1. |
| func2 | The function to execute if the value is of type T2. |

### Return Value

The result of the executed function.

### See Also

* class [OneOf&lt;T1,T2&gt;](../)
* namespace [Aspose.Svg.Builder](../../../aspose.svg.builder/)
* assembly [Aspose.SVG](../../../)
