---
title: DOMException
second_title: Riferimento API Aspose.SVG per .NET
description: Linterfaccia DOMException rappresenta un evento anomalo chiamato eccezione che si verifica come risultato della chiamata a un metodo o dellaccesso a una proprietà di unAPI Web. Questo è fondamentalmente il modo in cui le condizioni di errore sono descritte nelle API web.
type: docs
weight: 790
url: /it/net/aspose.svg.dom/domexception/
---
## DOMException class

L'interfaccia DOMException rappresenta un evento anomalo (chiamato eccezione) che si verifica come risultato della chiamata a un metodo o dell'accesso a una proprietà di un'API Web. Questo è fondamentalmente il modo in cui le condizioni di errore sono descritte nelle API web.

```csharp
public class DOMException : PlatformException
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [DOMException](domexception#constructor)(string) | Inizializza una nuova istanza di[`DOMException`](../domexception) classe. |
| [DOMException](domexception#constructor_1)(string, string) | Inizializza una nuova istanza di[`DOMException`](../domexception) classe. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [Code](../../aspose.svg.dom/domexception/code) { get; } | Restituisce un valore che contiene una delle costanti del codice di errore o 0 se nessuna corrisponde. Questo campo viene utilizzato per motivi storici. |
| override [Message](../../aspose.svg.dom/domexception/message) { get; } | Restituisce una stringa che rappresenta un messaggio o una descrizione associata al nome dell'errore specificato. |
| [Name](../../aspose.svg.dom/domexception/name) { get; } | Restituisce una stringa che contiene una delle stringhe associate a un nome di errore. |

## Campi

| Nome | Descrizione |
| --- | --- |
| const [ABORT_ERR](../../aspose.svg.dom/domexception/abort_err) | L'operazione è stata interrotta. |
| const [DATA_CLONE_ERR](../../aspose.svg.dom/domexception/data_clone_err) | L'oggetto non può essere clonato. |
| const [DOMSTRING_SIZE_ERR](../../aspose.svg.dom/domexception/domstring_size_err) | Se l'intervallo di testo specificato non rientra in una DOMString. |
| const [HIERARCHY_REQUEST_ERR](../../aspose.svg.dom/domexception/hierarchy_request_err) | Se un nodo è inserito da qualche parte non appartiene. |
| const [INDEX_SIZE_ERR](../../aspose.svg.dom/domexception/index_size_err) | Se l'indice o la dimensione è negativo o maggiore del valore consentito. |
| const [INUSE_ATTRIBUTE_ERR](../../aspose.svg.dom/domexception/inuse_attribute_err) | Se si tenta di aggiungere un attributo che è già in uso altrove. |
| const [INVALID_ACCESS_ERR](../../aspose.svg.dom/domexception/invalid_access_err) | Se un parametro o un'operazione non è supportata dall'oggetto sottostante. |
| const [INVALID_CHARACTER_ERR](../../aspose.svg.dom/domexception/invalid_character_err) | Se viene specificato un carattere non valido o illegale, ad esempio in un nome XML. |
| const [INVALID_EXPRESSION_ERR](../../aspose.svg.dom/domexception/invalid_expression_err) | L'espressione presenta un errore di sintassi o comunque non è un'espressione legale secondo le regole dello specifico XPathEvaluator o contiene funzioni di estensione specializzate o variabili non supportate da questa implementazione. |
| const [INVALID_MODIFICATION_ERR](../../aspose.svg.dom/domexception/invalid_modification_err) | Se si tenta di modificare il tipo dell'oggetto sottostante. |
| const [INVALID_NODE_TYPE_ERR](../../aspose.svg.dom/domexception/invalid_node_type_err) | Il nodo fornito non è corretto o ha un predecessore errato per questa operazione. |
| const [INVALID_STATE_ERR](../../aspose.svg.dom/domexception/invalid_state_err) | Se si tenta di utilizzare un oggetto che non è o non è più utilizzabile. |
| const [NAMESPACE_ERR](../../aspose.svg.dom/domexception/namespace_err) | Se si tenta di creare o modificare un oggetto in un modo non corretto per quanto riguarda gli spazi dei nomi. |
| const [NETWORK_ERR](../../aspose.svg.dom/domexception/network_err) | Si è verificato un errore di rete. |
| const [NOT_FOUND_ERR](../../aspose.svg.dom/domexception/not_found_err) | Se si tenta di fare riferimento a un nodo in un contesto in cui non esiste. |
| const [NOT_SUPPORTED_ERR](../../aspose.svg.dom/domexception/not_supported_err) | Se l'implementazione non supporta il tipo di oggetto o operazione richiesto. |
| const [NO_DATA_ALLOWED_ERR](../../aspose.svg.dom/domexception/no_data_allowed_err) | Se i dati sono specificati per un nodo che non supporta i dati. |
| const [NO_MODIFICATION_ALLOWED_ERR](../../aspose.svg.dom/domexception/no_modification_allowed_err) | Se si tenta di modificare un oggetto in cui non sono consentite modifiche. |
| const [QUOTA_EXCEEDED_ERR](../../aspose.svg.dom/domexception/quota_exceeded_err) | La quota è stata superata. |
| const [SECURITY_ERR](../../aspose.svg.dom/domexception/security_err) | L'operazione non è sicura. |
| const [SYNTAX_ERR](../../aspose.svg.dom/domexception/syntax_err) | Se viene specificata una stringa non valida o illegale. |
| const [TIMEOUT_ERR](../../aspose.svg.dom/domexception/timeout_err) | Timeout dell'operazione. |
| const [TYPE_ERR](../../aspose.svg.dom/domexception/type_err) | Impossibile convertire l'espressione per restituire il tipo specificato. |
| const [TYPE_MISMATCH_ERR](../../aspose.svg.dom/domexception/type_mismatch_err) | Se il tipo di un oggetto è incompatibile con il tipo previsto del parametro associato all'oggetto. |
| const [URL_MISMATCH_ERR](../../aspose.svg.dom/domexception/url_mismatch_err) | L'URL specificato non corrisponde a un altro URL. |
| const [VALIDATION_ERR](../../aspose.svg.dom/domexception/validation_err) | Se una chiamata a un metodo come insertBefore o removeChild rendesse il Nodo non valido rispetto alla "validità parziale", questa eccezione verrebbe sollevata e l'operazione non verrebbe eseguita. Questo codice viene utilizzato in [DOM Level 3 Validation]. Fare riferimento a questa specifica per ulteriori informazioni. |
| const [WRONG_DOCUMENT_ERR](../../aspose.svg.dom/domexception/wrong_document_err) | Se un Nodo viene utilizzato in un documento diverso da quello che lo ha creato (che non lo supporta). |

### Guarda anche

* class [PlatformException](../../aspose.svg/platformexception)
* spazio dei nomi [Aspose.Svg.Dom](../../aspose.svg.dom)
* assemblea [Aspose.SVG](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.SVG.dll -->
