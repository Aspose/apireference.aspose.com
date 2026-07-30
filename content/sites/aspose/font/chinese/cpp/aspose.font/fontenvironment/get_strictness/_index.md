---
title: "Aspose::Font::FontEnvironment::get_Strictness 方法"
linktitle: "get_Strictness"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::FontEnvironment::get_Strictness 方法。某些字体可能包含意外数据、未指定的特性，或在 C++ 中被粗略裁剪。"
type: docs
weight: 500
url: /zh/cpp/aspose.font/fontenvironment/get_strictness/
---
## FontEnvironment::get_Strictness method


某些字体可能包含意外数据、未指定的特性，或可能被粗略裁剪。

```cpp
FontEnvironment::ParsingStrictness Aspose::Font::FontEnvironment::get_Strictness() const
```

## 备注


对于希望打开任何字体而不考虑可能的 [Font](../../font/) 不足的用户，建议使用宽容设置。[Font](../../font/) 的内部结构不保证一致。对于希望打开大多数有效且可靠字体的用户，建议使用严格设置。
## 另见

* Enum [ParsingStrictness](../parsingstrictness/)
* Class [FontEnvironment](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
