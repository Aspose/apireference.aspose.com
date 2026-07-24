---
title: "Aspose::Page::EPS::XMP::XmpMetadata classe"
linktitle: "XmpMetadata"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::EPS::XMP::XmpMetadata classe. Fornisce l'accesso al flusso di metadati XMP in C++."
type: docs
weight: 200
url: /it/cpp/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class


Fornisce l'accesso al flusso di metadati [XMP](../).

```cpp
class XmpMetadata : public System::Collections::Generic::IDictionary<System::String, System::SharedPtr<XmpValue>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<XmpValue\>\&) override | Aggiunge un valore ai metadati. |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Aggiunge un valore ai metadati. |
| [Add](./add/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Aggiunge una coppia con chiave e valore nel dizionario. |
| [AddArrayItem](./addarrayitem/)(System::String, System::SharedPtr\<XmpValue\>) | Aggiunge un valore in un array. Il valore verrà aggiunto alla fine dell'array. |
| [AddArrayItem](./addarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Aggiunge un valore in un array all'indice specificato. |
| [AddNamedValue](./addnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Aggiunge un valore nominato in una struttura. |
| [Clear](./clear/)() override | Cancella i metadati. |
| [Contains](./contains/)(const System::String\&) const | Verifica se la chiave è contenuta nei metadati. |
| [Contains](./contains/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) const override | Verifica se la coppia chiave-valore specificata è contenuta nel dizionario. |
| [ContainsKey](./containskey/)(const System::String\&) const override | Determina se questo dizionario contiene la chiave specificata. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\>, int32_t) override | Copia gli elementi della collezione in un array. |
| [get_Count](./get_count/)() const override | Ottiene il conteggio degli elementi nella collezione. |
| [get_IsFixedSize](./get_isfixedsize/)() const | Verifica se la collezione ha dimensione fissa. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Verifica se la collezione è di sola lettura. |
| [get_IsSynchronized](./get_issynchronized/)() | Verifica se la collezione è sincronizzata. |
| [get_Keys](./get_keys/)() const override | Ottiene la collezione delle chiavi dei metadati. |
| [get_NamespaceManager](./get_namespacemanager/)() | Ottiene il gestore dello spazio dei nomi. |
| [get_SyncRoot](./get_syncroot/)() const | Ottiene l'oggetto di sincronizzazione della collezione. |
| [get_Values](./get_values/)() const override | Ottiene i valori nei metadati. |
| [GetEnumerator](./getenumerator/)() override | Restituisce l'enumeratore del dizionario. |
| [GetNamespaceUriByPrefix](./getnamespaceuribyprefix/)(System::String) | Restituisce l'URI dello spazio dei nomi per prefisso. |
| [GetPrefixByNamespaceUri](./getprefixbynamespaceuri/)(System::String) | Restituisce il prefisso per l'URI dello spazio dei nomi. |
| [idx_get](./idx_get/)(const System::String\&) const override | Ottiene i dati dai metadati. |
| [idx_set](./idx_set/)(const System::String\&, System::SharedPtr\<XmpValue\>) override | Imposta i dati dai metadati. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String) | Registra l'URI dello spazio dei nomi. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String, System::String) | Registra l'URI dello spazio dei nomi. |
| [Remove](./remove/)(const System::String\&) override | Rimuove la voce dai metadati. |
| [Remove](./remove/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Rimuove la coppia chiave/valore dalla collezione. |
| [SetArrayItem](./setarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Imposta il valore in un array. Il valore precedente sarà sostituito con quello nuovo. |
| [SetNamedValue](./setnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Imposta il valore nominato in una struttura. Il valore nominato precedente, se già esiste, sarà sostituito con quello nuovo. |
| [TryGetValue](./trygetvalue/)(const System::String\&, System::SharedPtr\<XmpValue\>\&) const override | Cerca di trovare la chiave nel dizionario e recupera il valore se trovato. |
## Vedi anche

* Class [IDictionary](../../system.collections.generic/idictionary/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
