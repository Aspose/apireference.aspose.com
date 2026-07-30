---
title: "Classe System::SmartPtr"
linktitle: "SmartPtr"
second_title: "Aspose.Font per C++"
description: "Classe System::SmartPtr. Classe puntatore per avvolgere tipi allocati sull'heap. Usala per gestire la memoria delle classi che ereditano Object. Questo tipo di puntatore segue la semantica dei puntatori intrusivi. Il contatore di riferimento è memorizzato o nell'Object stesso o in una struttura contatore strettamente legata all'istanza di Object. In ogni caso, tutte le istanze di SmartPtr formano un unico gruppo di proprietà indipendentemente da come sono state create, il che è diverso dal comportamento della classe std::shared_ptr. Convertire un puntatore grezzo in SmartPtr è sicuro poiché esistono altre istanze di SmartPtr che mantengono riferimenti condivisi allo stesso oggetto. Un'istanza della classe SmartPtr può trovarsi in uno dei due stati: puntatore condiviso e puntatore debole. Per mantenere vivo l'oggetto, il conteggio dei riferimenti condivisi deve essere positivo. Sia i puntatori deboli che quelli condivisi possono essere usati per accedere all'oggetto puntato (per chiamare metodi, leggere o scrivere campi, ecc.), ma i puntatori deboli non partecipano al conteggio dei riferimenti condivisi. L'Object viene eliminato quando l'ultimo puntatore ''shared'' SmartPtr ad esso viene distrutto. Quindi, assicurati che ciò non accada quando non esistono altri puntatori SmartPtr condivisi all'oggetto, ad es. durante la costruzione o la distruzione dell'oggetto. Usa gli oggetti sentinella System::Object::ThisProtector (nel codice C++) o gli attributi CppCTORSelfReference o CppSelfReference (nel codice C# tradotto) per risolvere questo problema. Allo stesso modo, assicurati di rompere i riferimenti ciclici usando la classe puntatore System::WeakPtr o la modalità puntatore System::SmartPtrMode::Weak (nel codice C++) o l'attributo CppWeakPtr (nel codice C# tradotto). Se due o più oggetti si riferiscono reciprocamente usando puntatori ''shared'', non verranno mai eliminati. Se il tipo di puntatore (debole o condiviso) deve essere cambiato a runtime, usa il metodo System::SmartPtr<T>::set_Mode() o la classe System::DynamicWeakPtr. La classe SmartPtr non contiene metodi virtuali. Dovresti ereditarla solo se stai creando una tua strategia di gestione della memoria. Questo tipo è un puntatore per gestire la cancellazione di altri oggetti. Deve essere allocato sullo stack e passato alle funzioni per valore o per riferimento costante in C++."
type: docs
weight: 5500
url: /it/cpp/system/smartptr/
---
## SmartPtr class


Classe puntatore per avvolgere tipi allocati sull'heap. Usala per gestire la memoria delle classi che ereditano [Object](../object/). Questo tipo di puntatore segue la semantica dei puntatori intrusivi. Il contatore di riferimento è memorizzato o in [Object](../object/) stesso o nella struttura contatore strettamente legata all'istanza di [Object](../object/). In ogni caso, tutte le istanze di [SmartPtr](./) formano un unico gruppo di proprietà indipendentemente da come sono state create, il che è diverso dal comportamento della classe std::shared_ptr. Convertire un puntatore grezzo in [SmartPtr](./) è sicuro poiché esistono altre istanze di [SmartPtr](./) che mantengono riferimenti condivisi allo stesso oggetto. Un'istanza della classe [SmartPtr](./) può trovarsi in uno dei due stati: puntatore condiviso e puntatore debole. Per mantenere vivo l'oggetto, il conteggio dei riferimenti condivisi deve essere positivo. Sia i puntatori deboli che quelli condivisi possono essere usati per accedere all'oggetto puntato (per chiamare metodi, leggere o scrivere campi, ecc.), ma i puntatori deboli non partecipano al conteggio dei riferimenti condivisi. [Object](../object/) viene eliminato quando l'ultimo puntatore 'shared' [SmartPtr](./) ad esso viene distrutto. Quindi, assicurati che ciò non accada quando non esistono altri puntatori [SmartPtr](./) condivisi all'oggetto, ad es. durante la costruzione o la distruzione dell'oggetto. Usa gli oggetti sentinella System::Object::ThisProtector (nel codice C++) o gli attributi CppCTORSelfReference o CppSelfReference (nel codice C# tradotto) per risolvere questo problema. Allo stesso modo, assicurati di rompere i riferimenti ciclici usando la classe puntatore [System::WeakPtr](../weakptr/) o la modalità puntatore [System::SmartPtrMode::Weak](../smartptrmode/) (nel codice C++) o l'attributo CppWeakPtr (nel codice C# tradotto). Se due o più oggetti si riferiscono reciprocamente usando puntatori 'shared', non verranno mai eliminati. Se il tipo di puntatore (debole o condiviso) deve essere cambiato a runtime, usa il metodo [System::SmartPtr<T>::set_Mode()](./set_mode/) o la classe [System::DynamicWeakPtr](../dynamicweakptr/). La classe [SmartPtr](./) non contiene metodi virtuali. Dovresti ereditarla solo se stai creando una tua strategia di gestione della memoria. Questo tipo è un puntatore per gestire la cancellazione di altri oggetti. Deve essere allocato sullo stack e passato alle funzioni per valore o per riferimento costante.

```cpp
template<class T>class SmartPtr
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo dell'oggetto puntato. Deve essere o [System::Object](../object/) o una sua sottoclasse. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [begin](./begin/)() | Accessor per il metodo [begin()](./begin/) di una collezione sottostante. Compila solo se [SmartPtr_](./smartptr_/) è un tipo specializzato con il metodo [begin()](./begin/). |
| [begin](./begin/)() const | Accessor per il metodo [begin()](./begin/) di una collezione sottostante. Compila solo se [SmartPtr_](./smartptr_/) è un tipo specializzato con il metodo [begin()](./begin/). |
| [Cast](./cast/)() const | Casta il puntatore al suo stesso tipo. |
| [Cast](./cast/)() const | Casta il puntatore al tipo base usando static_cast. |
| [Cast](./cast/)() const | Casta il puntatore al tipo derivato usando dynamic_cast. |
| [Cast](./cast/)() const | Casta il puntatore al tipo derivato usando dynamic_cast. |
| [cbegin](./cbegin/)() const | Accessor per il metodo [cbegin()](./cbegin/) di una collezione sottostante. Compila solo se [SmartPtr_](./smartptr_/) è un tipo specializzato con il metodo [cbegin()](./cbegin/). |
| [cend](./cend/)() const | Accessor per il metodo [cend()](./cend/) di una collezione sottostante. Compila solo se [SmartPtr_](./smartptr_/) è un tipo specializzato con il metodo [cend()](./cend/). |
| [const_pointer_cast](./const_pointer_cast/)() const | Casta il puntatore a un tipo diverso usando const_cast sull'oggetto puntato. |
| [dynamic_pointer_cast](./dynamic_pointer_cast/)() const | Casta il puntatore a un tipo diverso usando dynamic_cast sull'oggetto puntato. |
| [end](./end/)() | Accessor per il metodo [end()](./end/) di una collezione sottostante. Compila solo se [SmartPtr_](./smartptr_/) è un tipo specializzato con il metodo [end()](./end/). |
| [end](./end/)() const | Accessor per il metodo [end()](./end/) di una collezione sottostante. Compila solo se [SmartPtr_](./smartptr_/) è un tipo specializzato con il metodo [end()](./end/). |
| [get](./get/)() const | Ottiene l'oggetto puntato. |
| [get_Mode](./get_mode/)() const | Ottiene la modalità del puntatore. |
| [get_shared](./get_shared/)() const | Ottiene l'oggetto puntato, ma verifica che il puntatore sia in modalità condivisa. |
| [get_shared_count](./get_shared_count/)() const | Ottiene il numero di puntatori condivisi esistenti per l'oggetto di riferimento, incluso quello corrente. Verifica che il puntatore corrente sia in modalità condivisa. |
| [GetHashCode](./gethashcode/)() const | Chiama [GetHashCode()](./gethashcode/) sull'oggetto puntato. |
| [GetObjectNotNull](./getobjectnotnull/)() const | Ottiene l'oggetto attualmente referenziato (se presente) o lancia un'eccezione. |
| [GetObjectOrNull](./getobjectornull/)() const | Ottiene l'oggetto puntato (se presente) o nullptr. Uguale a [get()](./get/). |
| [GetObjectOwner](./getobjectowner/)() const | Ottiene l'oggetto referenziato. |
| [GetPointer](./getpointer/)() const | Ottiene l'oggetto puntato (se presente) o nullptr. Uguale a [get()](./get/). |
| [Is](./is/)(const System::TypeInfo\&) const | Verifica se l'oggetto puntato è di un tipo specifico o di un suo tipo figlio. Segue la semantica 'is' di C#. |
| [IsAliasingPtr](./isaliasingptr/)() const | Verifica se il puntatore è puntato a un oggetto diverso da quello posseduto (creato da un costruttore di aliasing). |
| [IsShared](./isshared/)() const | Verifica se il puntatore è in modalità condivisa. |
| [IsWeak](./isweak/)() const | Verifica se il puntatore è in modalità debole. |
| explicit [operator bool](./operatorbool/)() const | Verifica se il puntatore non è nullo. |
| [operator!](./operator!/)() const | Verifica se il puntatore è nullo. |
| [operator*](./operator_/)() const | Ottiene un riferimento all'oggetto puntato. Verifica che il puntatore non sia nullo. |
| [operator->](./operator-_/)() const | Consente di accedere ai membri dell'oggetto referenziato. |
| [operator<](./operator_/)(Y *) const | Fornisce la semantica di confronto minore per la classe [SmartPtr](./). |
| [operator<](./operator_/)(SmartPtr\<Y\> const\&) const | Fornisce la semantica di confronto minore per la classe [SmartPtr](./). |
| [operator=](./operator=/)(SmartPtr_\&&) | Assegna per spostamento l'oggetto [SmartPtr](./). x diventa inutilizzabile. |
| [operator=](./operator=/)(const SmartPtr_\&) | Assegna per copia l'oggetto [SmartPtr](./). |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | Assegna per copia l'oggetto [SmartPtr](./). Esegue le conversioni di tipo necessarie. |
| [operator=](./operator=/)(Pointee_ *) | Assegna un puntatore grezzo all'oggetto [SmartPtr](./). |
| [operator=](./operator=/)(std::nullptr_t) | Imposta il valore del puntatore a nullptr. |
| [operator==](./operator==/)(std::nullptr_t) const | Verifica se il puntatore punta a nullptr. |
| [operator[]](./operator[]/)(IdxType) const | Accessor per gli elementi dell'array. Compila solo se [SmartPtr_](./smartptr_/) è una specializzazione di [System::Array](../array/). |
| [RemoveAliasing](./removealiasing/)() const | Rimuove l'aliasing (creato da un costruttore di aliasing) dal puntatore, assicurandosi che gestisca (se condiviso) o tracci (se debole) lo stesso oggetto a cui punta. |
| [reset](./reset/)(Pointee_ *) | Imposta l'oggetto puntato. |
| [reset](./reset/)() | Fa sì che il puntatore punti a nullptr. |
| [set_Mode](./set_mode/)(SmartPtrMode) | Imposta la modalità del puntatore. Può modificare i contatori di riferimento dell'oggetto referenziato. |
| [SetContainedTemplateWeakPtr](./setcontainedtemplateweakptr/)(uint32_t) const | Chiama il metodo SetTemplateWeakPtr() sull'oggetto puntato (se presente). |
| [SmartPtr](./smartptr/)(SmartPtrMode) | Crea un oggetto [SmartPtr](./) nella modalità richiesta. |
| [SmartPtr](./smartptr/)(std::nullptr_t, SmartPtrMode) | Crea un oggetto [SmartPtr](./) nullo nella modalità richiesta. |
| [SmartPtr](./smartptr/)(Pointee_ *, SmartPtrMode) | Crea un [SmartPtr](./) che punta all'oggetto specificato, oppure converte un puntatore grezzo in [SmartPtr](./). |
| [SmartPtr](./smartptr/)(const SmartPtr_\&, SmartPtrMode) | Costruisce per copia un oggetto [SmartPtr](./). Entrambi i puntatori puntano allo stesso oggetto successivamente. |
| [SmartPtr](./smartptr/)(const SmartPtr\<Q\>\&, SmartPtrMode) | Costruisce per copia un oggetto [SmartPtr](./). Entrambi i puntatori puntano allo stesso oggetto successivamente. Esegue la conversione di tipo se consentita. |
| [SmartPtr](./smartptr/)(SmartPtr_\&&, SmartPtrMode) | Costruisce per spostamento un oggetto [SmartPtr](./). In pratica, scambia due puntatori, se entrambi sono della stessa modalità. x potrebbe diventare inutilizzabile dopo la chiamata. |
| explicit [SmartPtr](./smartptr/)(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) | Converte il tipo dell'array referenziato creando un nuovo array di tipo diverso. Utile se in C# esiste un cast di tipo array non supportato in C++. |
| explicit [SmartPtr](./smartptr/)(const Y\&) | Inizializza un array vuoto. Usato per tradurre alcune costruzioni di codice C#. |
| [SmartPtr](./smartptr/)(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) | Costruisce un [SmartPtr](./) che condivide le informazioni di proprietà con il valore iniziale di ptr, ma contiene un puntatore p non correlato e non gestito. |
| [static_pointer_cast](./static_pointer_cast/)() const | Esegue il cast del puntatore a un tipo diverso usando static_cast sull'oggetto puntato. |
| [ToObjectPtr](./toobjectptr/)() const | Converte qualsiasi tipo di puntatore in un puntatore a [Object](../object/). Non richiede che il tipo [Pointee_](./pointee_/) sia completo. |
| static [Type](./type/)() | Scorciatoia per ottenere l'oggetto [System::TypeInfo](../typeinfo/) per il tipo [Pointee_](./pointee_/). |
| [~SmartPtr](./~smartptr/)() | Distrugge l'oggetto [SmartPtr](./). Se necessario, decrementa il contatore di riferimento dell'oggetto puntato e lo elimina. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [ArrayType](./arraytype/) | Stesso di [Pointee_](./pointee_/), se è una specializzazione di [System::Array](../array/), altrimenti void. |
| [Pointee_](./pointee_/) | Tipo puntato. |
| [SmartPtr_](./smartptr_/) | Tipo di smart pointer specializzato. |
| [ValueType](./valuetype/) | Tipo di memorizzazione dell'array puntato. Ha senso solo se T è una specializzazione di [System::Array](../array/). |

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
