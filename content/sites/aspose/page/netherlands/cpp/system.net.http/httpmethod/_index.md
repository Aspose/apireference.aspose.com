---
title: "System::Net::Http::HttpMethod klasse"
linktitle: "HttpMethod"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::HttpMethod klasse. Vertegenwoordigt een HTTP-methode. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 700
url: /nl/cpp/system.net.http/httpmethod/
---
## HttpMethod class


Vertegenwoordigt een HTTP-methode. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class HttpMethod : public System::IEquatable<System::SharedPtr<System::Net::Http::HttpMethod>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<HttpMethod\>) override | Bepaalt of de huidige en opgegeven objecten gelijk zijn. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| static [get_Delete](./get_delete/)() | Retourneert de 'DELETE' HTTP-methode. |
| static [get_Get](./get_get/)() | Retourneert de 'GET' HTTP-methode. |
| static [get_Head](./get_head/)() | Retourneert de 'HEAD' HTTP-methode. |
| [get_Method](./get_method/)() | Retourneert een tekenreeksrepresentatie van de HTTP-methode. |
| static [get_Options](./get_options/)() | Retourneert de 'OPTIONS' HTTP-methode. |
| static [get_Post](./get_post/)() | Retourneert de 'POST' HTTP-methode. |
| static [get_Put](./get_put/)() | Retourneert de 'PUT' HTTP-methode. |
| static [get_Trace](./get_trace/)() | Retourneert de 'TRACE' HTTP-methode. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| [HttpMethod](./httpmethod/)(String) | Construeert een nieuw exemplaar. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
## Zie ook

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
