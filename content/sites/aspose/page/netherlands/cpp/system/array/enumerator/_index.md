---
title: "System::Array::Enumerator klasse"
linktitle: "Enumerator"
second_title: "Aspose.Page voor C++"
description: "System::Array::Enumerator klasse. Implementeert de IEnumerator-interface die enumeratie van elementen van een Array-object mogelijk maakt. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument door te geven aan functies in C++."
type: docs
weight: 6800
url: /nl/cpp/system/array/enumerator/
---
## Enumerator class


Implementeert de IEnumerator-interface die enumeratie van elementen van een [Array](../) object mogelijk maakt. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../smartptr/) pointer en gebruik deze pointer om deze als argument door te geven aan functies.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<T>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<Array\<T\>\>\&) | Construeert een nieuw [Enumerator](./) object dat de opgegeven array vertegenwoordigt. |
| [get_Current](./get_current/)() const override | Retourneert een kopie van het huidige element. |
| [MoveNext](./movenext/)() override | Controleert of de index van het huidige element niet naar het laatste element in de array wijst en verhoogt deze indien dit niet het geval is. |
| [Reset](./reset/)() override | Stelt de index van het huidige element opnieuw in. |
| virtual [~Enumerator](./~enumerator/)() | Destructor. |
## Zie ook

* Class [Object](../../object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
