---
title: "Aspose::Font::CffDataProviders::CffUpdateStringIndexStrategy enum"
linktitle: "CffUpdateStringIndexStrategy"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::CffDataProviders::CffUpdateStringIndexStrategy enum. CFF String INDEX depolamasına dize eklemenin nasıl yapılacağını belirtir. CFF String INDEX'e bir dize eklemeye çalıştığımızda, bu dizenin zaten String INDEX'te mevcut olabileceği bir durum olabilir. SearchForDuplicates seçeneğini kullanarak, bu dizenin zaten mevcut olup olmadığını tespit etmek için String INDEX üzerinde aramayı zorlayabiliriz. Bu yaklaşım, String INDEX yapısında yer tasarrufu sağlar, ancak C++'de dize eklemek için daha fazla zaman gerektirir."
type: docs
weight: 1000
url: /tr/cpp/aspose.font.cffdataproviders/cffupdatestringindexstrategy/
---
## CffUpdateStringIndexStrategy enum


CFF String INDEX depolamasına dize eklemenin nasıl yapılacağını belirtir. CFF String INDEX'e bir dize eklemeye çalıştığımızda, bu dizenin zaten String INDEX'te mevcut olabileceği bir durum olabilir. [SearchForDuplicates](./) seçeneğini kullanarak, bu dizenin zaten mevcut olup olmadığını tespit etmek için String INDEX üzerinde aramayı zorlayabiliriz. Bu yaklaşım, String INDEX yapısında yer tasarrufu sağlar, ancak dize eklemek için daha fazla zaman gerektirir.

```cpp
enum class CffUpdateStringIndexStrategy
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| SearchForDuplicates | 0 | Eklenmek istenen dize için aramanın, yinelenen eklemeleri önlemek amacıyla String INDEX yapısında yapılması gerektiğini belirtir. |
| AddStringAsIs | 1 | Bir dize eklenirken yinelenen öğeler için hiçbir kontrolün yapılmaması gerektiğini belirtir. Bu yaklaşım daha hızlı çalışır, ancak String INDEX için verimsiz bellek kullanımına neden olabilir. |

## Ayrıca Bakınız

* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)
