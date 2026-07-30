---
title: "Aspose::Font::FontEnvironment::get_Strictness method"
linktitle: "get_Strictness"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::FontEnvironment::get_Strictness method. Некоторые шрифты могут содержать неожиданные данные, неуказанные функции или быть грубо обрезанными в C++."
type: docs
weight: 500
url: /ru/cpp/aspose.font/fontenvironment/get_strictness/
---
## FontEnvironment::get_Strictness method


Некоторые шрифты могут содержать неожиданные данные, неуказанные функции или быть грубо обрезанными.

```cpp
FontEnvironment::ParsingStrictness Aspose::Font::FontEnvironment::get_Strictness() const
```

## Примечания


Рекомендуется режим Tolerant для потребителей, которые хотят открывать любой шрифт независимо от возможных недостатков [Font](../../font/). Внутренние структуры [Font](../../font/) не гарантируют согласованность. Рекомендуется режим Strict для потребителей, которые хотят открывать в основном корректные и надёжные шрифты.
## См. также

* Enum [ParsingStrictness](../parsingstrictness/)
* Class [FontEnvironment](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
