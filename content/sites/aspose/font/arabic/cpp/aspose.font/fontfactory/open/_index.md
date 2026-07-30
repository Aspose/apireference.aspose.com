---
title: "طريقة Aspose::Font::FontFactory::Open"
linktitle: "Open"
second_title: "Aspose.Font لـ C++"
description: "طريقة Aspose::Font::FontFactory::Open. تفتح خطًا، باستخدام نوع الخط ومصفوفة بايتات بيانات الخط في C++."
type: docs
weight: 200
url: /ar/cpp/aspose.font/fontfactory/open/
---
## FontFactory::Open(FontType, System::ArrayPtr\<uint8_t\>) method


يفتح خطًا باستخدام نوع الخط ومصفوفة بايتات بيانات الخط.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::ArrayPtr<uint8_t> fontData)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) النوع. |
| fontData | System::ArrayPtr\<uint8_t\> | مصفوفة بايتات لتحميل الخط منها. |

### ReturnValue

[Font](../../font/) loaded.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(FontType, System::SharedPtr\<Sources::StreamSource\>) method


يفتح خطًا باستخدام نوع الخط ومصدر الدفق.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::SharedPtr<Sources::StreamSource> fontStreamSource)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) النوع. |
| fontStreamSource | System::SharedPtr\<Sources::StreamSource\> | مصدر الدفق للخط. |

### ReturnValue

[Font](../../font/) loaded.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Class [StreamSource](../../../aspose.font.sources/streamsource/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(FontType, System::String) method


يفتح خطًا باستخدام نوع الخط واسم ملف الخط.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(FontType fontType, System::String fileName)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| fontType | FontType | [Font](../../font/) النوع. |
| fileName | System::String | [Font](../../font/) اسم الملف. |

### ReturnValue

[Font](../../font/) loaded.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Enum [FontType](../../fonttype/)
* Class [String](../../../system/string/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## FontFactory::Open(System::SharedPtr\<Sources::FontDefinition\>) method


يفتح خطًا باستخدام كائن FontDefinition.

```cpp
System::SharedPtr<Font> Aspose::Font::FontFactory::Open(System::SharedPtr<Sources::FontDefinition> fontDefinition)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| fontDefinition | System::SharedPtr\<Sources::FontDefinition\> | [Font](../../font/) كائن التعريف. |

### ReturnValue

[Font](../../font/) loaded.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Font](../../font/)
* Class [FontDefinition](../../../aspose.font.sources/fontdefinition/)
* Class [FontFactory](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
