---
title: "System namespace"
linktitle: "System"
second_title: "Aspose.Font per C++"
description: "Come utilizzare il namespace System in C++."
type: docs
weight: 2500
url: /it/cpp/system/
---



## Classi

| Classe | Descrizione |
| --- | --- |
| [Activator](./activator/) | Contiene metodi per creare tipi di oggetti. |
| [Array](./array/) | Classe che rappresenta una struttura dati array. Gli oggetti di questa classe dovrebbero essere allocati solo usando le funzioni [System::MakeArray()](./makearray/) e [System::MakeObject()](./makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usare questo puntatore per passarla alle funzioni come argomento. |
| [ArraySegment](./arraysegment/) | Rappresenta un segmento dell'array monodimensionale. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non usare mai la classe [System::SmartPtr](./smartptr/) per gestire oggetti di questo tipo. |
| [Attribute](./attribute/) | Una classe base per attributi personalizzati. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](./makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usare questo puntatore per passarla alle funzioni come argomento. |
| [BitConverter](./bitconverter/) | Contiene metodi che eseguono conversioni di sequenze di byte in un tipo valore e viceversa. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo. |
| [Boolean](./boolean/) | Classe che mantiene i membri statici del tipo [System.Boolean](./boolean/) .[Net](../system.net/). |
| [BoxedEnum](./boxedenum/) | Rappresenta un valore di enumerazione boxed. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](./makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usare questo puntatore per passarla alle funzioni come argomento. |
| [BoxedValue](./boxedvalue/) | Rappresenta un valore boxed. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](./makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usare questo puntatore per passarla alle funzioni come argomento. |
| [BoxedValueBase](./boxedvaluebase/) | Una classe base che definisce un'interfaccia e implementa alcuni metodi fondamentali di una classe discendente che rappresenta un valore boxed. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](./makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usare questo puntatore per passarla alle funzioni come argomento. |
| [Buffer](./buffer/) | Contiene metodi che manipolano array di byte grezzi. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo. |
| [Byte](./byte/) | Contiene metodi per lavorare con l'intero senza segno a 8 bit. |
| [Char](./char/) | Fornisce metodi per la manipolazione di caratteri rappresentati come unità di codice UTF-16. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo. |
| [Comparison](./comparison/) | Rappresenta un puntatore al metodo che confronta due oggetti dello stesso tipo. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non usare mai la classe [System::SmartPtr](./smartptr/) per gestire oggetti di questo tipo. |
| [Console](./console/) | Fornisce metodi per l'output di dati sullo stream di output standard. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo. |
| [ConsoleOutput](./consoleoutput/) | Rappresenta lo stream di output standard. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](./makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usare questo puntatore per passarla alle funzioni come argomento. |
| [DateTime](./datetime/) | Rappresenta un valore specifico di data e ora sul continuum temporale. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non usare mai la classe [System::SmartPtr](./smartptr/) per gestire oggetti di questo tipo. |
| [DateTimeOffset](./datetimeoffset/) | Contiene la data e l'ora del giorno relative al Tempo Universale Coordinato. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [DBNull](./dbnull/) | Rappresenta un valore non esistente. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [Decimal](./decimal/) | Rappresenta un numero decimale. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](./smartptr/) per gestire oggetti di questo tipo. |
| [DefaultBoxedValue](./defaultboxedvalue/) | Implementazione della classe [BoxedValue](./boxedvalue/). Consente alle specializzazioni di BoxingValue di essere dichiarate senza duplicare il codice comune. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [Delegate< ReturnType(ArgumentTypes...)>](./delegate_returntype(argumenttypes...)_/) | Rappresenta un puntatore a una funzione, metodo o oggetto funzione. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](./smartptr/) per gestire oggetti di questo tipo. |
| [DynamicWeakPtr](./dynamicweakptr/) | Classe smart pointer che traccia le modalità dei puntatori degli argomenti template dell'oggetto memorizzato e le aggiorna dopo ogni assegnazione. Questo tipo è un puntatore per gestire la cancellazione di altri oggetti. Dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento const. |
| [EnumValues](./enumvalues/) | Fornisce informazioni meta sui costanti di enumerazione del tipo enum **E**. |
| [EnumValuesBase](./enumvaluesbase/) | Una classe base per una classe che rappresenta le informazioni meta di un tipo di enumerazione. |
| [EventArgs](./eventargs/) | La classe base per le classi che rappresentano un contesto passato agli iscritti agli eventi quando un evento viene attivato. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [ExceptionWrapper](./exceptionwrapper/) | Template che rappresenta un wrapper delle eccezioni derivate dalla classe [Exception](./exception/). |
| [FlagsAttribute](./flagsattribute/) | Indica che un'enumerazione può essere trattata come un campo di bit; cioè, un insieme di. |
| [Func](./func/) | Delegato di funzione. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](./smartptr/) per gestire oggetti di questo tipo. |
| [GC](./gc/) | Rappresenta una Garbage Collection emulata che agisce più come un stub e non fa effettivamente nulla. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo. |
| [Guid](./guid/) | Rappresenta un Identificatore Unico Globale. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](./smartptr/) per gestire oggetti di questo tipo. |
| [IAsyncResult](./iasyncresult/) | Rappresenta lo stato di un'operazione asincrona. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [ICloneable](./icloneable/) | Definisce un metodo che consente il clonaggio di oggetti - creando una copia di un oggetto. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [IComparable](./icomparable/) | Definisce un metodo che confronta due oggetti. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [IConvertible](./iconvertible/) | Definisce metodi che convertono il valore del riferimento o del tipo valore implementato in un tipo runtime del linguaggio comune che ha un valore equivalente. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [ICustomFormatter](./icustomformatter/) | Definisce un metodo che esegue la formattazione personalizzata della rappresentazione stringa di un valore rappresentato dall'oggetto specificato. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [IDisposable](./idisposable/) | Definisce un metodo che rilascia le risorse possedute dall'oggetto corrente. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [IEquatable](./iequatable/) | Definisce un metodo che determina l'uguaglianza di due oggetti. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [IFormatProvider](./iformatprovider/) | Definisce un metodo che fornisce informazioni di formattazione. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [IFormattable](./iformattable/) | Definisce un metodo che formatta il valore dell'oggetto corrente utilizzando la stringa di formato specificata e il provider di formato. |
| [Int16](./int16/) | Contiene metodi per lavorare con l'intero a 16 bit. |
| [Int32](./int32/) | Contiene metodi per lavorare con l'intero a 32 bit. |
| [Int64](./int64/) | Contiene metodi per lavorare con l'intero a 64 bit. |
| [LockContext](./lockcontext/) | Oggetto di guardia che implementa l'istruzione lock() di C#. |
| [MarshalByRefObject](./marshalbyrefobject/) | Fornisce l'accesso agli oggetti attraverso i confini dei domini dell'applicazione in applicazioni con remoting abilitato. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [MulticastDelegate< ReturnType(ArgumentTypes...)>](./multicastdelegate_returntype(argumenttypes...)_/) | Rappresenta una collezione di delegati. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non usare mai la classe [System::SmartPtr](./smartptr/) per gestire oggetti di questo tipo. |
| [Nullable](./nullable/) | Dichiarazione in avanti. |
| [NullableUtils](./nullableutils/) | Rappresenta la classe statica C# [System.Nullable](./nullable/) (senza argomenti di tipo). Impossibile utilizzare il nome originale a causa dell'impossibilità di sovraccaricare i template di classe in C++. Supporta un tipo valore che può essere assegnato a null. Questa classe non può essere ereditata. |
| [Object](./object/) | Classe base che consente l'uso dei metodi disponibili per la classe [System.Object](./object/) in C#. Tutte le classi non banali utilizzate con l'ambiente tradotto dovrebbero ereditarla. |
| [ObjectExt](./objectext/) | Fornisce metodi statici che emulano i metodi C# [Object](./object/) chiamati per tipi C++ non-Object (stringhe, numeri, ecc.). Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo. |
| [ObjectType](./objecttype/) | Fornisce metodi statici che implementano i getter dei tipi di oggetto. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo. |
| [OperatingSystem](./operatingsystem/) | Rappresenta un sistema operativo specifico e fornisce informazioni su di esso. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [Random](./random/) | Rappresenta un generatore di numeri pseudo-casuali. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [ReadOnlySpan](./readonlyspan/) | Dichiarazione in avanti da usare all'interno della classe [Span](./span/). |
| [ScopedCulture](./scopedculture/) | Rappresenta una cultura utilizzata all'interno dell'ambito. |
| [SmartPtr](./smartptr/) | Classe puntatore per avvolgere tipi allocati sull'heap. Usala per gestire la memoria delle classi che ereditano [Object](./object/). Questo tipo di puntatore segue la semantica dei puntatori intrusivi. Il contatore di riferimento è memorizzato o nell'[Object](./object/) stesso o in una struttura di contatore strettamente legata all'istanza di [Object](./object/). In ogni caso, tutte le istanze di [SmartPtr](./smartptr/) formano un unico gruppo di proprietà indipendentemente da come sono state create, a differenza del comportamento della classe std::shared_ptr. Convertire un puntatore grezzo in [SmartPtr](./smartptr/) è sicuro, dato che esistono altre istanze di [SmartPtr](./smartptr/) che mantengono riferimenti condivisi allo stesso oggetto. Un'istanza della classe [SmartPtr](./smartptr/) può trovarsi in uno dei due stati: puntatore condiviso e puntatore debole. Per mantenere vivo l'oggetto, il conteggio dei riferimenti condivisi deve essere positivo. Sia i puntatori deboli che quelli condivisi possono essere usati per accedere all'oggetto puntato (per chiamare metodi, leggere o scrivere campi, ecc.), ma i puntatori deboli non partecipano al conteggio dei riferimenti dei puntatori condivisi. L'[Object](./object/) viene eliminato quando l'ultimo puntatore 'shared' di [SmartPtr](./smartptr/) ad esso viene distrutto. Quindi, assicurati che ciò non accada quando non esistono altri puntatori [SmartPtr](./smartptr/) condivisi verso l'oggetto, ad esempio durante la costruzione o la distruzione dell'oggetto. Usa gli oggetti sentinella System::Object::ThisProtector (nel codice C++) o gli attributi CppCTORSelfReference o CppSelfReference (nel codice C# tradotto) per risolvere il problema. Allo stesso modo, assicurati di rompere i riferimenti ciclici usando la classe puntatore [System::WeakPtr](./weakptr/) o la modalità puntatore [System::SmartPtrMode::Weak](./smartptrmode/) (nel codice C++) o l'attributo CppWeakPtr (nel codice C# tradotto). Se due o più oggetti si riferiscono reciprocamente usando puntatori 'shared', non verranno mai eliminati. Se il tipo di puntatore (debole o condiviso) deve essere cambiato a runtime, usa il metodo [System::SmartPtr<T>::set_Mode()](./smartptr/set_mode/) o la classe [System::DynamicWeakPtr](./dynamicweakptr/). La classe [SmartPtr](./smartptr/) non contiene metodi virtuali. Dovresti ereditarla solo se stai creando una tua strategia di gestione della memoria. Questo tipo è un puntatore per gestire la cancellazione di altri oggetti. Deve essere allocato sullo stack e passato alle funzioni per valore o per riferimento costante. |
| [SmartPtrInfo](./smartptrinfo/) | Classe di servizio per testare e modificare i contenuti di [SmartPtr](./smartptr/) senza conoscere il tipo finale. Usata per la raccolta dei rifiuti e la rilevazione di riferimenti ciclici, ecc. Considerala come un 'puntatore a puntatore'. Non possiamo usare il tipo base di [SmartPtr](./smartptr/) poiché non ne ha uno; invece, utilizziamo questa classe 'info'. |
| [Span](./span/) | Rappresenta una regione contigua di memoria arbitraria simile a std::span di C++20. |
| [String](./string/) | Classe [String](./string/) usata in tutta la libreria. È un sostituto per C# [System.String](./string/) durante la traduzione del codice. Per motivi di ottimizzazione, non è considerata una sottoclasse di [Object](./object/). Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non usare mai la classe [System::SmartPtr](./smartptr/) per gestire oggetti di questo tipo. |
| [StringComparer](./stringcomparer/) | Confronta le stringhe usando diversi modi di comparazione. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [StringHashCompiletime](./stringhashcompiletime/) | Una classe di supporto che genera un valore hash da una c-string. |
| [TimeSpan](./timespan/) | Rappresenta un intervallo di tempo. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non usare mai la classe [System::SmartPtr](./smartptr/) per gestire oggetti di questo tipo. |
| [TimeZone](./timezone/) | Rappresenta un fuso orario. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [TimeZoneInfo](./timezoneinfo/) | Rappresenta un'informazione che descrive un fuso orario particolare. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [Tuple](./tuple/) | Classe che rappresenta una struttura dati tuple. Il numero massimo di elementi è 8. |
| [TupleFactory](./tuplefactory/) | Fornisce metodi statici per creare oggetti tuple. |
| [TypeInfo](./typeinfo/) | Rappresenta un tipo specifico e fornisce informazioni su di esso. |
| [Uri](./uri/) | Identificatore di risorsa unificato. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [UriBuilder](./uribuilder/) | Fornisce metodi per costruire e modificare identificatori di risorse universali (URI). Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [UriParser](./uriparser/) | Utilizzato per analizzare un nuovo schema URI. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](./makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](./smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [UriShim](./urishim/) | Classe di servizio. |
| [ValueTuple](./valuetuple/) | Classe che rappresenta una struttura dati [ValueTuple](./valuetuple/). |
| [ValueType](./valuetype/) | Classe base per tipi valore con ereditarietà da [Object](./object/) troncata per motivi di prestazioni. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non usare mai la classe [System::SmartPtr](./smartptr/) per gestire oggetti di questo tipo. |
| [Version](./version/) | Rappresenta un numero di versione. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non usare mai la classe [System::SmartPtr](./smartptr/) per gestire oggetti di questo tipo. |
| [Void](./void/) |  |
| [WeakPtr](./weakptr/) | Sottoclasse di [System::SmartPtr](./smartptr/) che si imposta in modalità debole al momento della costruzione. Si prega di notare che questa classe non garantisce che la sua istanza rimanga sempre in modalità debole poiché [set_Mode()](./smartptr/set_mode/) è ancora accessibile. Questo tipo è un puntatore per gestire l'eliminazione di altri oggetti. Deve essere allocato sullo stack e passato alle funzioni per valore o per riferimento costante. |
| [WeakReference](./weakreference/) | Rappresenta un riferimento debole, che fa riferimento a un oggetto consentendone comunque la cancellazione. |
| [WeakReference< T >](./weakreference_t_/) | Rappresenta un riferimento debole, che fa riferimento a un oggetto consentendone comunque la cancellazione. |
| [WeakReference<>](./weakreference__/) | Rappresenta un riferimento debole, che fa riferimento a un oggetto consentendone comunque la cancellazione. |
## Enums

| Enumerazione | Descrizione |
| --- | --- |
| [Base64FormattingOptions](./base64formattingoptions/) | Enumerazione contenente valori che rappresentano diversi formati di dati codificati in base-64. |
| [DateTimeKind](./datetimekind/) | Valori dell'enumerazione che rappresentano i tipi di data e ora. |
| [DayOfWeek](./dayofweek/) | Enumerazione che rappresenta un giorno della settimana. |
| [EnvironmentVariableTarget](./environmentvariabletarget/) | Specifica la posizione della variabile d'ambiente. |
| [MidpointRounding](./midpointrounding/) | Specifica il comportamento delle funzioni di arrotondamento. |
| [PlatformID](./platformid/) | Rappresenta una piattaforma del sistema operativo. |
| [SmartPtrMode](./smartptrmode/) | Tipo di puntatore [SmartPtr](./smartptr/): debole o condiviso. Definisce se il puntatore viene conteggiato quando si decide se eliminare l'oggetto o meno. |
| [StringComparison](./stringcomparison/) | Definisce lo stile di confronto delle stringhe. |
| [StringSplitOptions](./stringsplitoptions/) | Determina il comportamento della divisione delle stringhe. |
| [TypeCode](./typecode/) | Rappresenta il tipo di un oggetto. |
| [UriComponents](./uricomponents/) | Rappresenta i componenti dell'URI. |
| [UriFormat](./uriformat/) | Specifica come l'URI è codificato. |
| [UriHostNameType](./urihostnametype/) | Rappresenta il tipo di nome host. |
| [UriKind](./urikind/) | Rappresenta i tipi di URI. |
| [UriPartial](./uripartial/) | Rappresenta le parti di un URI per il metodo [Uri.GetLeftPart](./uri/getleftpart/). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Action](./action/) | Tipo di delegato che fa riferimento a metodi che non hanno valore di ritorno. |
| [AggregateException](./aggregateexception/) |  |
| [ArrayPtr](./arrayptr/) | Alias per il tipo 'pointer to array'. |
| [AsyncCallback](./asynccallback/) | Un tipo delegate che rappresenta un metodo da chiamare quando l'operazione asincrona termina. |
| [BadImageFormatException](./badimageformatexception/) | L'eccezione che viene lanciata quando l'immagine file di una libreria a collegamento dinamico (DLL) o di un programma eseguibile è non valida. Non avvolgere mai le istanze della classe [BadImageFormatException](./badimageformatexception/) in [System::SmartPtr](./smartptr/). |
| [ByteArrayPtr](./bytearrayptr/) | Un alias per un oggetto smart pointer che punta a un array di interi senza segno a 8 bit. |
| [Converter](./converter/) | Rappresenta un puntatore all'entità invocabile che accetta un singolo argomento del tipo **TInput** e restituisce un valore del tipo **TOutput**. |
| [DecoderFallbackBufferPtr](./decoderfallbackbufferptr/) | Un alias per un smart pointer che punta a un'istanza della classe [System::Text::DecoderFallbackBuffer](../system.text/decoderfallbackbuffer/). |
| [DecoderFallbackPtr](./decoderfallbackptr/) | Un alias per un smart pointer che punta a un'istanza della classe [System::Text::DecoderFallback](../system.text/decoderfallback/). |
| [DecoderPtr](./decoderptr/) | Un alias per un smart pointer che punta a un'istanza della classe [System::Text::Decoder](../system.text/decoder/). |
| [DecoderReplacementFallbackPtr](./decoderreplacementfallbackptr/) | Un alias per un smart pointer che punta a un'istanza della classe [System::Text::DecoderReplacementFallback](../system.text/decoderreplacementfallback/). |
| [DirectoryInfoPtr](./directoryinfoptr/) | Un alias per un smart pointer che punta a un'istanza della classe [System::IO::DirectoryInfo](../system.io/directoryinfo/). |
| [EncoderFallbackBufferPtr](./encoderfallbackbufferptr/) | Un alias per un smart pointer che punta a un'istanza della classe [System::Text::EncoderFallbackBuffer](../system.text/encoderfallbackbuffer/). |
| [EncoderFallbackPtr](./encoderfallbackptr/) | Un alias per un smart pointer che punta a un'istanza della classe [System::Text::EncoderFallback](../system.text/encoderfallback/). |
| [EncoderPtr](./encoderptr/) | Un alias per un smart pointer che punta a un'istanza della classe [System::Text::Encoder](../system.text/encoder/). |
| [EncoderReplacementFallbackBufferPtr](./encoderreplacementfallbackbufferptr/) | Un alias per un smart pointer che punta a un'istanza della classe [System::Text::EncoderReplacementFallbackBuffer](../system.text/encoderreplacementfallbackbuffer/). |
| [EncoderReplacementFallbackPtr](./encoderreplacementfallbackptr/) | Un alias per un smart pointer che punta a un'istanza della classe [System::Text::EncoderReplacementFallback](../system.text/encoderreplacementfallback/). |
| [EncodingInfoPtr](./encodinginfoptr/) | Un alias per un smart pointer che punta a un'istanza della classe [System::Text::EncodingInfo](../system.text/encodinginfo/). |
| [EncodingPtr](./encodingptr/) | Un alias per un smart pointer che punta a un'istanza della classe [System::Text::Encoding](../system.text/encoding/). |
| [Event](./event/) | Rappresenta un evento - un meccanismo attraverso il quale gli iscritti vengono notificati di un'occorrenza di interesse mediante l'invocazione di un delegate. |
| [EventArgsPtr](./eventargsptr/) | Puntatore condiviso a un'istanza della classe [EventArgs](./eventargs/). |
| [EventHandler](./eventhandler/) | Rappresenta un metodo che reagisce e elabora un evento. Questo tipo dovrebbe essere allocato sullo stack e passato alle funzioni per valore o per riferimento. Non utilizzare mai la classe [System::SmartPtr](./smartptr/) per gestire oggetti di questo tipo. |
| [Exception](./exception/) | Alias da usare al posto di Details::Exception. |
| [ExceptionPtr](./exceptionptr/) | Alias di tipo usato dai wrapper di eccezioni. |
| [FileInfoPtr](./fileinfoptr/) | Un alias per un smart pointer che punta a un'istanza della classe [System::IO::FileInfo](../system.io/fileinfo/). |
| [FileStreamPtr](./filestreamptr/) | Un alias per un smart pointer che punta a un'istanza della classe [System::IO::FileStream](../system.io/filestream/). |
| [FileSystemInfoPtr](./filesysteminfoptr/) | Un alias per un smart pointer che punta a un'istanza della classe [System::IO::FileSystemInfo](../system.io/filesysteminfo/). |
| [FunctionPtr](./functionptr/) | Un alias per il tipo di funzione con convenzione di chiamata predefinita. |
| [IAsyncResultPtr](./iasyncresultptr/) | Puntatore condiviso a [IAsyncResult](./iasyncresult/). |
| [IFormatProviderPtr](./iformatproviderptr/) | Un alias per un puntatore intelligente che punta a un'istanza della classe [System::IFormatProvider](./iformatprovider/). |
| [MakeConstRef_t](./makeconstref_t/) | Tipo di supporto per il modificatore [MakeConstRef](./makeconstref/). |
| [MemoryStreamPtr](./memorystreamptr/) | Un alias per un puntatore intelligente che punta a un'istanza della classe [System::IO::MemoryStream](../system.io/memorystream/). |
| [Predicate](./predicate/) | Rappresenta un puntatore a un predicato - un'entità invocabile che accetta un singolo argomento e restituisce un valore bool. |
| [RTaskPtr](./rtaskptr/) | Un alias per un puntatore intelligente che punta a un'istanza della classe [System::Threading::Tasks::ResultTask](../system.threading.tasks/resulttask/). |
| [SharedPtr](./sharedptr/) | Alias per un puntatore intelligente ampiamente usato nella libreria. |
| [StreamPtr](./streamptr/) | Un alias per un puntatore intelligente che punta a un'istanza della classe [System::IO::Stream](../system.io/stream/). |
| [StreamReaderPtr](./streamreaderptr/) | Un alias per un puntatore intelligente che punta a un'istanza della classe [System::IO::StreamReader](../system.io/streamreader/). |
| [StreamWriterPtr](./streamwriterptr/) | Un alias per un puntatore intelligente che punta a un'istanza della classe [System::IO::StreamWriter](../system.io/streamwriter/). |
| [StringComparerPtr](./stringcomparerptr/) | Un alias per un puntatore condiviso a un'istanza della classe [StringComparer](./stringcomparer/). |
| [TaskPtr](./taskptr/) | Un alias per un puntatore intelligente che punta a un'istanza della classe [System::Threading::Tasks::Task](../system.threading.tasks/task/). |
| [TimeZoneInfoPtr](./timezoneinfoptr/) | Alias per un puntatore condiviso a un'istanza della classe [TimeZoneInfo](./timezoneinfo/). |
| [TimeZonePtr](./timezoneptr/) | Puntatore condiviso a un'istanza della classe [TimeZone](./timezone/). |
## Functions

| Funzione | Descrizione |
| --- | --- |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| AsCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Build | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| BuildArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| BuildObject | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Cast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEnumerableTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEnumerableTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CheckedCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Compare | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Compare | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| const_pointer_cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastCostante | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Predefinito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Predefinito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Scarta | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| EseguiTryFinally | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| EseguiTryFinally | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| EseguiTryFinally | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| dynamic_pointer_cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastDinamico | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastDinamico | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastDinamico | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastDinamico | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastDinamico | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastDinamico | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastDinamico | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastDinamico_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastDinamico_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastDinamico_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastDinamicoArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| EnumOttieniNome | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| EnumOttieniNome | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Uguali | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Uguali< double, double > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Uguali< float, float > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEsplicito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEsplicito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEsplicito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEsplicito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEsplicito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEsplicito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEsplicito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEsplicito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEsplicito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEsplicito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEsplicito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEsplicito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEsplicito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEsplicito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEsplicito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEsplicito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEsplicito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEsplicito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| CastEsplicito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ForzaCastStatico | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PerOgniMembroGVNome | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MaggioreUguale | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ottieni | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ottieni | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ottieni | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ottieni | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| get_pointer | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| OttieniCodiceHash | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| OttieniCodiceHash | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| OttieniCodiceHash | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| OttieniCodiceHash | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| OttieniCodiceHash | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Maggiore | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| InizializzaOggetto | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| È | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| È | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| È | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| is_parametrized_test | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| is_vp_test | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ÈEnumMetaInfoDefinito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ÈEnumMetaInfoDefinito | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsInfinity | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsNaN | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsNegativeInfinity | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsPositiveInfinity | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IsTuple | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| IterateOver | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| LEqual | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Less | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeObject | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeObject | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeScopeGuard | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeSharedPtr | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeSharedPtr | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeTuple | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeValueAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeValueAsync | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeYieldEnumerable | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MakeYieldEnumerator | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| MemberwiseClone | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ObjectType::GetType< System::DateTime > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| ObjectType::GetType< System::String > | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator* | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator+ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator- | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator/ | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<< | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator<= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator>> | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| PrintTo | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ref | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ref | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Ref | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| SafeInvoke | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| Set | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_decrement_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_post_increment_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| setter_wrap | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| static_pointer_cast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCast_noexcept | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCastArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| StaticCastArray | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| TieTuple | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| With | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| With | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
