---
title: TxtLoadStyleStrategy Enum 
linktitle: TxtLoadStyleStrategy
second_title: Aspose.Cells for Go via C++ API Reference
description: 'TxtLoadStyleStrategy enum. Encapsulates the object that represents txtloadstylestrategy in Go.'
type: docs
weight: 200
url: /go-cpp/txtloadstylestrategy/
---

## TxtLoadStyleStrategy Enum

Specifies how to apply style for parsed values when converting string value to number or datetime.

```go

type TxtLoadStyleStrategy int32


```

## Fields

| Field | Description |
| --- | --- |
|[None](./none/) | Does not set style for the parsed value. | 
|[BuiltIn](./builtin/) | Set the style as built-in number/datetime when the parsed value are plain numeric/datetime values. | 
|[ExactFormat](./exactformat/) | Set the exact custom format for the parsed value to make the formatted value be same with the original input one. | 
