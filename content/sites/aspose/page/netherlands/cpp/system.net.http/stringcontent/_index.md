---
title: "System::Net::Http::StringContent klasse"
linktitle: "StringContent"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::StringContent klasse. Vertegenwoordigt HTTP-inhoud als een tekenreeks. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 1100
url: /nl/cpp/system.net.http/stringcontent/
---
## StringContent class


Vertegenwoordigt HTTP-inhoud als een tekenreeks. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class StringContent : public System::Net::Http::ByteArrayContent
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [StringContent](./stringcontent/)(String) | RTTI-informatie. |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>) | Construeert een nieuw exemplaar. |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>, String) | Construeert een nieuw exemplaar. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | De standaardcodering. |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | Het maximum aantal bytes. |
## Zie ook

* Class [ByteArrayContent](../bytearraycontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
