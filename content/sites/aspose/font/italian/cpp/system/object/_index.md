---
title: "Classe System::Object"
linktitle: "Object"
second_title: "Aspose.Font per C++"
description: "Classe System::Object. Classe base che consente di utilizzare i metodi disponibili per la classe System.Object in C#. Tutte le classi non banali utilizzate con l'ambiente tradotto dovrebbero ereditarla in C++."
type: docs
weight: 4800
url: /it/cpp/system/object/
---
## Object class


Classe base che consente di utilizzare i metodi disponibili per la classe [System.Object](./) in C#. Tutte le classi non banali utilizzate con l'ambiente tradotto dovrebbero ereditarla.

```cpp
class Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Equals](./equals/)(ptr) | Confronta gli oggetti usando la semantica di C# [Object.Equals](./equals/). |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | Confronta gli oggetti di tipo riferimento nello stile C#. |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | Confronta gli oggetti di tipo valore nello stile C#. |
| static [Equals](./equals/)(float const\&, float const\&) | Emula il confronto in virgola mobile in stile C# dove due NaN sono considerati uguali anche se, secondo IEC 60559:1989, NaN non è uguale a nessun valore, incluso NaN. |
| static [Equals](./equals/)(double const\&, double const\&) | Emula il confronto in virgola mobile in stile C# dove due NaN sono considerati uguali anche se, secondo IEC 60559:1989, NaN non è uguale a nessun valore, incluso NaN. |
| virtual [FastCast](./fastcast/)(const Details::FastRttiBase\&, void **) const | Solo per scopi interni. |
| [GetCounter](./getcounter/)() | Ottiene la struttura dati del contatore di riferimenti associata all'oggetto. |
| virtual [GetHashCode](./gethashcode/)() const | Analogo del metodo C# [Object.GetHashCode()](./gethashcode/). Consente l'hashing di oggetti personalizzati. |
| virtual [GetType](./gettype/)() const | Ottiene il tipo reale dell'oggetto. Analogo della chiamata C# [System.Object.GetType()](./gettype/). |
| virtual [Is](./is/)(const TypeInfo\&) const | Verifica se l'oggetto rappresenta un'istanza del tipo descritto da targetType. Analogo dell'operatore C# 'is'. |
| [Lock](./lock/)() | Implementa il blocco dell'istruzione C# lock(). Chiamalo direttamente o usa l'oggetto sentinella [LockContext](../lockcontext/). |
| virtual [MemberwiseClone](./memberwiseclone/)() const | Analogo del metodo C# [Object.MemberwiseClone()](./memberwiseclone/). Consente la clonazione di tipi personalizzati. |
| [Object](./object/)() | Crea l'oggetto. Inizializza tutte le strutture dati interne. |
| [Object](./object/)(Object const\&) | Costruttore di copia. Non copia nulla, in realtà, inizializza solo un nuovo oggetto e consente la costruzione di copie delle sottoclassi. |
| [operator=](./operator=/)(Object const\&) | Operatore di assegnazione. Non copia nulla, in realtà, inizializza solo un nuovo oggetto e consente la costruzione di copie delle sottoclassi. |
| static [ReferenceEquals](./referenceequals/)(ptr const\&, ptr const\&) | Confronta gli oggetti per riferimento. |
| static [ReferenceEquals](./referenceequals/)(T const\&, T const\&) | Confronta gli oggetti per riferimento. |
| static [ReferenceEquals](./referenceequals/)(T const\&, std::nullptr_t) | Confronta per riferimento un oggetto di tipo valore con nullptr. |
| [ReferenceEquals](./referenceequals/)(String const\&, std::nullptr_t) | Specializzazione di [Object::ReferenceEquals](./referenceequals/) per il caso di stringa e nullptr. |
| [ReferenceEquals](./referenceequals/)(String const\&, String const\&) | Specializzazione di [Object::ReferenceEquals](./referenceequals/) per il caso di stringhe. |
| [RemovedSharedRefs](./removedsharedrefs/)(int) | Decrementa il conteggio dei riferimenti condivisi del valore specificato. |
| virtual [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) | Imposta il n‑esimo argomento del template a un puntatore debole (invece di condiviso). Consente di passare i puntatori nei contenitori alla modalità debole. |
| [SharedCount](./sharedcount/)() const | Ottiene il valore corrente del contatore dei riferimenti condivisi. |
| [SharedRefAdded](./sharedrefadded/)() | Incrementa il conteggio dei riferimenti condivisi. Non dovrebbe essere chiamato direttamente; invece, usa i puntatori intelligenti o ThisProtector. |
| [SharedRefRemovedSafe](./sharedrefremovedsafe/)() | Decrementa e restituisce il conteggio dei riferimenti condivisi. Non dovrebbe essere chiamato direttamente; invece, usa i puntatori intelligenti o ThisProtector. |
| virtual [ToString](./tostring/)() const | Analogo del metodo C# [Object.ToString()](./tostring/). Consente di convertire oggetti personalizzati in stringa. |
| static [Type](./type/)() | Implementa la costruzione C# typeof([System.Object](./)). |
| [Unlock](./unlock/)() | Implementa lo sblocco dell'istruzione C# lock(). Chiama direttamente o usa l'oggetto sentinella [LockContext](../lockcontext/). |
| [WeakRefAdded](./weakrefadded/)() | Incrementa il conteggio dei riferimenti deboli. Non dovrebbe essere chiamato direttamente; invece, usa i puntatori intelligenti o ThisProtector. |
| [WeakRefRemoved](./weakrefremoved/)() | Decrementa il conteggio dei riferimenti deboli. Non dovrebbe essere chiamato direttamente; invece, usa i puntatori intelligenti o ThisProtector. |
| virtual [~Object](./~object/)() | Distrugge l'oggetto. Libera tutte le strutture dati interne. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [ptr](./ptr/) | Alias per il tipo di puntatore intelligente. |
## Osservazioni


Oltre ai metodi disponibili nella classe C# [System.Object](./), consente anche il supporto a alcuni concetti specifici per l'ambiente di codice tradotto. Ciò include il conteggio dei riferimenti utilizzato dalle classi di puntatori intelligenti ([System::SmartPtr](../smartptr/), [System::WeakPtr](../weakptr/), [System::DynamicWeakPtr](../dynamicweakptr/)) e altri servizi relativi alla gestione della memoria, al debug, ecc.

Ogni [Object](./) ha due contatori di riferimento: il contatore di riferimento condiviso e il contatore di riferimento debole. Il contatore di riferimento debole è sempre memorizzato in una struttura dati separata anziché nell'[Object](./) stesso, il che consente ai puntatori deboli di sopravvivere all'oggetto referenziato. Il contatore di riferimento intelligente è memorizzato o nell'oggetto stesso o nella stessa struttura separata, a seconda dello stato della macro ENABLE_EXTERNAL_REFCOUNT. Per impostazione predefinita, è abilitato nelle build di debug e disabilitato nelle build di rilascio. Se il contatore del puntatore intelligente è memorizzato nell'oggetto stesso, la struttura dati separata viene creata solo se esistono puntatori deboli verso l'oggetto. Altrimenti, viene creata insieme all'oggetto stesso.

Tutti i puntatori intelligenti utilizzano questi due contatori di riferimento e contribuiscono allo stesso unico gruppo di proprietà.

Se una sottoclasse di [Object](./) viene creata sullo stack, non possono essere creati puntatori intelligenti verso di essa, altrimenti si verifica un problema di cancellazione dallo stack.

Questo tipo può essere allocato sia sullo stack come tipo valore sia sull'heap usando la funzione [System::MakeObject()](../makeobject/). Una volta che l'oggetto è allocato, non mescolare mai questi due casi d'uso: avere puntatori [SmartPtr](../smartptr/) verso oggetti allocati sullo stack è strettamente proibito.
## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
