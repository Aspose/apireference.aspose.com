---
title: "Aspose::Font::FontEnvironment sınıfı"
linktitle: "FontEnvironment"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::FontEnvironment sınıfı. C++'ta mevcut ortam ve platform hakkında bilgi sağlar."
type: docs
weight: 600
url: /tr/cpp/aspose.font/fontenvironment/
---
## FontEnvironment class


Geçerli ortam ve platform hakkında bilgi sağlar.

```cpp
class FontEnvironment : public System::Object
```

## Enums

| Enum | Açıklama |
| --- | --- |
| [ParsingStrictness](./parsingstrictness/) | Ayrıştırma katılığı türleri. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [get_CffCommonFontsSettings](./get_cffcommonfontssettings/)() | CFF yazı tipleri için ortak ayarlar. |
| static [get_Current](./get_current/)() | Geçerli ortamı alır. |
| [get_CurrentPlatformId](./get_currentplatformid/)() | Geçerli platform kimliğini alır. |
| [get_FontSpecificEncodings](./get_fontspecificencodings/)() const | Tüketici-bilinçli Yazı tipleri için belirli kodlamaları depolar. Örneğin, PDF belgeleri Adobe Symbol ve ZapfDingbats özel kodlamalarını kullanır. |
| [get_Strictness](./get_strictness/)() const | Bazı Yazı tipleri beklenmeyen veri, belirtilmemiş özellikler içerebilir veya kaba bir şekilde kırpılmış olabilir. |
| [set_Strictness](./set_strictness/)(FontEnvironment::ParsingStrictness) | Bazı Yazı tipleri beklenmeyen veri, belirtilmemiş özellikler içerebilir veya kaba bir şekilde kırpılmış olabilir. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
