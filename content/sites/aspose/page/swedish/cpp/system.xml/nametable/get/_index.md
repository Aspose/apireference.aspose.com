---
title: "System::Xml::NameTable::Get method"
linktitle: "Hämta"
second_title: "Aspose.Page för C++"
description: "System::Xml::NameTable::Get method. Returnerar den atomiserade strängen som innehåller samma tecken som det angivna intervallet av tecken i den givna arrayen i C++."
type: docs
weight: 300
url: /sv/cpp/system.xml/nametable/get/
---
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


Returnerar den atomiserade strängen som innehåller samma tecken som det angivna teckensintervallet i den givna arrayen.

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| nyckel | const ArrayPtr\<char16_t\>\& | Teckenarrayen som innehåller namnet att söka efter. |
| start | int32_t | Det nollbaserade indexet i arrayen som anger det första tecknet i namnet. |
| len | int32_t | Antalet tecken i namnet. |

### ReturnValue

Den atomiserade strängen eller **nullptr** om strängen ännu inte har atomiserats. Om **len** är noll returneras [String::Empty](../../../system/string/empty/).

## Se även

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Get(const String\&) method


Returnerar den atomiserade strängen med det angivna värdet.

```cpp
const String & System::Xml::NameTable::Get(const String &value) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | const String\& | Namnet att söka efter. |

### ReturnValue

Det atomiserade strängobjektet eller **nullptr** om strängen ännu inte har atomiserats.

## Se även

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
