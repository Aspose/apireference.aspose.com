---
title: "classe System::ObjectExt"
linktitle: "ObjectExt"
second_title: "Aspose.Font per C++"
description: "Classe System::ObjectExt. Fornisce metodi statici che emulano i metodi Object di C# chiamati per tipi C++ non‑Object (stringhe, numeri, ecc.). Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo in C++."
type: docs
weight: 4900
url: /it/cpp/system/objectext/
---
## ObjectExt class


Fornisce metodi statici che emulano i metodi C# [Object](../object/) chiamati per tipi C++ non‑Object (stringhe, numeri, ecc.). Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo.

```cpp
class ObjectExt : public System::ObjectType
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [ArrayInitializerCast](./arrayinitializercast/)(From ...) | Converte i valori fondamentali degli array (che C# fa implicitamente ma C++ apparentemente no). |
| static [Box](./box/)(const T\&) | Effettua il boxing dei tipi valore per la conversione a [Object](../object/). Implementazione per i tipi enum. |
| static [Box](./box/)(const T\&) | Effettua il boxing dei tipi valore per la conversione a [Object](../object/). Implementazione per i tipi non‑enum. |
| static [Box](./box/)(const T\&) | Effettua il boxing dei tipi [Nullable](../nullable/) per la conversione a [Object](../object/). |
| static [Box](./box/)(const String\&) | Effettua il boxing dei valori stringa. |
| static [BoxEnum](./boxenum/)(T) | Effettua il boxing dei tipi enum per essere propagati come [Object](../object/). |
| static [CastToIList](./casttoilist/)(const SmartPtr\<Object\>\&) |  |
| static [Coalesce](./coalesce/)(T0, T1) | Implementazione della traduzione dell'operatore '??' per i tipi non nullable. |
| static [Coalesce](./coalesce/)(System::Nullable\<T0\>, T1) | Implementazione della traduzione dell'operatore '??' per i tipi nullable. |
| static [CoalesceAssign](./coalesceassign/)(T0\&, T1) | Implementazione della traduzione dell'operatore '??='. |
| static [CoalesceInternal](./coalesceinternal/)(RT1, F) | Implementazione della traduzione dell'operatore '??' per i tipi non nullable. Sovraccarico per il caso in cui RT2 è convertibile in RT1. |
| static [Equals](./equals/)(const T\&, const T2\&) |  |
| static [Equals](./equals/)(const T\&, const T2\&) | Sostituzione per le chiamate C# [Object.Equals](../object/equals/) funzionanti per qualsiasi tipo in C++. Sovraccarico per i tipi smart pointer. |
| static [Equals](./equals/)(T, const T2\&) | Sostituzione per le chiamate C# [Object.Equals](../object/equals/) funzionanti per qualsiasi tipo in C++. Sovraccarico per i tipi struttura. |
| static [Equals](./equals/)(const T\&, const T2\&) | Sostituzione per le chiamate C# [Object.Equals](../object/equals/) funzionanti per qualsiasi tipo in C++. Sovraccarico per i tipi scalari. |
| static [Equals](./equals/)(const char_t(&), String) | Sostituzione per le chiamate C# [Object.Equals](../object/equals/) funzionanti per qualsiasi tipo in C++. Sovraccarico per i letterali stringa con confronto di stringhe. |
| static [Equals](./equals/)(const float\&, const float\&) | Emula il confronto in virgola mobile in stile C# dove due NaN sono considerati uguali anche se, secondo IEC 60559:1989, NaN non è uguale a nessun valore, incluso NaN. |
| static [Equals](./equals/)(const double\&, const double\&) | Emula il confronto in virgola mobile in stile C# dove due NaN sono considerati uguali anche se, secondo IEC 60559:1989, NaN non è uguale a nessun valore, incluso NaN. |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [GetHashCode](./gethashcode/)(const T\&) | Implementa le chiamate [GetHashCode()](./gethashcode/); funziona sia sulle sottoclassi di [Object](../object/) sia su tipi non correlati. |
| static [Is](./is/)(const T\&) | Implementa la traduzione dell'operatore 'is'. Specializzazione per i tipi boxabili (valore) che sono esattamente questi. |
| static [Is](./is/)(const U\&) | Implementa la traduzione dell'operatore 'is'. Specializzazione per i tipi puntatore ottimizzati per le classi 'final'. |
| static [Is](./is/)(const U\&) | Implementa la traduzione dell'operatore 'is'. Specializzazione per i tipi puntatore. |
| static [Is](./is/)(const Object\&) | Implementa la traduzione dell'operatore 'is'. Specializzazione per i tipi valore. |
| static [Is](./is/)(const Object\&) | Implementa la traduzione dell'operatore 'is'. Specializzazione per i tipi non convertibili. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | Implementa la traduzione dell'operatore 'is'. Specializzazione per i tipi puntatore. |
| static [Is](./is/)(const ExceptionWrapper\<U\>\&) | Implementa la traduzione dell'operatore 'is'. Specializzazione per i tipi wrapper di eccezione. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Implementa la traduzione dell'operatore 'is'. Specializzazione per tipi nullable. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Implementa la traduzione dell'operatore 'is'. Specializzazione per tipi incapsulabili con l'operatore == definito. |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | Implementa la traduzione dell'operatore 'is'. Specializzazione per tipi incapsulabili senza l'operatore == definito. |
| static [Is](./is/)(const SmartPtr\<V\>\&) | Implementa la traduzione dell'operatore 'is'. Specializzazione per tipi valore incapsulati in interfacce. |
| static [Is](./is/)(const SmartPtr\<U\>\&) | Implementa la traduzione dell'operatore 'is'. Specializzazione per tipi enum. |
| static [Is](./is/)(const WeakPtr\<U\>\&) | Implementa la traduzione dell'operatore 'is'. Specializzazione per tipi enum rispetto a puntatori deboli. |
| static [Is](./is/)(const Nullable\<U\>\&) | Implementa la traduzione dell'operatore 'is'. Specializzazione per il tipo [Nullable](../nullable/). |
| static [Is](./is/)(const char16_t *) | Implementa la traduzione dell'operatore 'is'. Specializzazione per letterale stringa. |
| static [Is](./is/)(int32_t) | Implementa la traduzione dell'operatore 'is'. Specializzazione per letterale intero. |
| static [IsBoxedValue](./isboxedvalue/)(const SmartPtr\<Object\>\&) | Verifica se l'oggetto è un valore incapsulato. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | Converte [Object](../object/) in un tipo sconosciuto, gestendo sia il tipo smart pointer sia le situazioni di valore bpxed. |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | Converte [Object](../object/) in un tipo sconosciuto, gestendo sia il tipo smart pointer sia le situazioni di valore incapsulato. |
| static [ToString](./tostring/)(const char_t *) | Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++. |
| static [ToString](./tostring/)(const Nullable\<T\>\&) | Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++. |
| static [ToString](./tostring/)(const T\&) | Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++. |
| static [ToString](./tostring/)(const T\&) | Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++. |
| static [ToString](./tostring/)(T\&) | Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++. |
| static [ToString](./tostring/)(T\&) | Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++. |
| static [ToString](./tostring/)(T\&&) | Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++. |
| static [ToString](./tostring/)(T\&) | Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++. |
| static [ToString](./tostring/)(const T\&) | Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++. |
| static [ToString](./tostring/)(T\&&) | Sostituzione del metodo ToString di C# per funzionare su qualsiasi tipo C++. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Deincapsula i tipi valore dopo la conversione in [Object](../object/). Implementazione per tipi enum. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Deincapsula i tipi valore dopo la conversione in [Object](../object/). Implementazione per tipi non enum e non nullable. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Deincapsula i tipi valore dopo la conversione in [Object](../object/). Implementazione per tipi non enum e non nullable. |
| static [Unbox](./unbox/)(E) | Deincapsula i tipi enum in intero. |
| static [Unbox](./unbox/)(E) | Converte i tipi enum. |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | Deincapsula i valori stringa. |
| static [UnboxStringSafe](./unboxstringsafe/)(const SmartPtr\<Object\>\&) | Deincapsula la stringa da valore incapsulato. |
| static [UnboxToNullable](./unboxtonullable/)(const SmartPtr\<Object\>\&, bool) | Deincapsula l'oggetto in tipo nullable. |
| static [UnknownIsNull](./unknownisnull/)(T) | Verifica se l'oggetto di tipo sconosciuto è nullptr. Sovraccarico per tipi non scalari. |
| static [UnknownIsNull](./unknownisnull/)(T) | Verifica se l'oggetto di tipo sconosciuto è nullptr. Sovraccarico per tipi scalari. |
| static [UnknownToObject](./unknowntoobject/)(T) | Converte il tipo sconosciuto in [Object](../object/), gestendo sia il tipo smart pointer sia le situazioni di tipo valore. |
| static [UnknownToObject](./unknowntoobject/)(const T\&) | Converte il tipo sconosciuto in [Object](../object/), gestendo sia il tipo smart pointer sia le situazioni di tipo valore. |
## Vedi anche

* Class [ObjectType](../objecttype/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
