---
title: "Namespace System::Text::RegularExpressions"
linktitle: "System::Text::RegularExpressions"
second_title: "Aspose.Font per C++"
description: "Come utilizzare il namespace System::Text::RegularExpressions in C++."
type: docs
weight: 6800
url: /it/cpp/system.text.regularexpressions/
---



## Classi

| Classe | Descrizione |
| --- | --- |
| [Capture](./capture/) | Risultato della corrispondenza di una singola sottoespressione. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [CaptureCollection](./capturecollection/) | Elenco delle catture effettuate da un singolo gruppo di cattura. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [Group](./group/) | Risultato della corrispondenza effettuata da un singolo gruppo di cattura. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [GroupCollection](./groupcollection/) | Elenco dei gruppi di cattura in una singola corrispondenza. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [GroupCollectionPtr](./groupcollectionptr/) | [Group](./group/) puntatore alla collezione. Questo tipo è un puntatore per gestire l'eliminazione di altri oggetti. Dovrebbe essere allocato sullo stack e passato alle funzioni sia per valore sia per riferimento const. |
| [Match](./match/) | [Single](../system/single/) corrispondenza di regexp su stringa. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [MatchCollection](./matchcollection/) | Collezione di corrispondenze ottenuta applicando ripetutamente l'espressione regolare a una stringa. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
| [Regex](./regex/) | Espressione regolare che segue una sintassi simile a C#. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento. |
## Enums

| Enumerazione | Descrizione |
| --- | --- |
| [RegexOptions](./regexoptions/) | [Regex](./regex/) opzioni. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [CaptureCollectionPtr](./capturecollectionptr/) | Puntatore alla collezione di catture. |
| [CapturePtr](./captureptr/) | Puntatore a un singolo oggetto di cattura. |
| [GroupPtr](./groupptr/) | Puntatore al gruppo. |
| [MatchCollectionPtr](./matchcollectionptr/) | [Match](./match/) puntatore alla collezione. |
| [MatchEvaluator](./matchevaluator/) | Tipo delegate per valutare la corrispondenza. |
| [MatchPtr](./matchptr/) | [Match](./match/) puntatore. |
| [RegexPtr](./regexptr/) | [Regex](./regex/) puntatore. |
| [UStringPtr](./ustringptr/) | UnicodeString condivisa per evitare copie. |
