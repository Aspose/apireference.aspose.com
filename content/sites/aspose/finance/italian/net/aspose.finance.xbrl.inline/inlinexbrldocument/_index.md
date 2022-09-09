---
title: InlineXbrlDocument
second_title: Aspose.Finance per .NET API Reference
description: Un documento XBRL in linea.
type: docs
weight: 7750
url: /it/net/aspose.finance.xbrl.inline/inlinexbrldocument/
---
## InlineXbrlDocument class

Un documento XBRL in linea.

```csharp
public class InlineXbrlDocument : Document
```

## Costruttori

| Nome | Descrizione |
| --- | --- |
| [InlineXbrlDocument](inlinexbrldocument)(string) | Inizializza una nuova istanza di[`InlineXbrlDocument`](../inlinexbrldocument) classe e apri un file. |

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/arcrolereferences) { get; } | Ottiene la raccolta di[`ArcroleReference`](../../aspose.finance.xbrl/arcrolereference) nel documento XBRL in linea. |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri) { get; } | Ottiene l'URI di base assoluto di questo nodo o null se l'implementazione non è stata in grado di ottenere un URI assoluto. |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset) { get; } | Ottiene la codifica del documento. |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements) { get; } | Ottiene gli elementi figlio. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes) { get; } | Ottiene i nodi figlio. |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype) { get; } | Ottiene il tipo di contenuto del documento. |
| [Contexts](../../aspose.finance.xbrl.inline/inlinexbrldocument/contexts) { get; } | Ottiene la raccolta di[`Context`](../../aspose.finance.xbrl/context) nel documento XBRL in linea. |
| [Continuations](../../aspose.finance.xbrl.inline/inlinexbrldocument/continuations) { get; } | Ottiene la raccolta di[`InlineContinuation`](../inlinecontinuation) nel documento XBRL in linea. |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement) { get; } | Questo è un attributo di convenienza che consente l'accesso diretto al nodo figlio che è l'elemento del documento del documento. |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi) { get; } | Ottiene l'URI del documento. |
| [Facts](../../aspose.finance.xbrl.inline/inlinexbrldocument/facts) { get; } | Ottiene la raccolta di[`InlineFact`](../inlinefact) nel documento XBRL in linea. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild) { get; } | Ottiene il primo figlio di questo nodo. Se non esiste un tale nodo, restituisce null. |
| [Footnotes](../../aspose.finance.xbrl.inline/inlinexbrldocument/footnotes) { get; } | Ottiene la raccolta di[`InlineFootnote`](../inlinefootnote) nel documento XBRL in linea. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes) { get; } | Ottiene se questo nodo ha figli. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild) { get; } | Ottiene l'ultimo figlio di questo nodo. Se non esiste un tale nodo, restituisce null. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname) { get; } | Ottiene la parte locale del nome qualificato di questo nodo. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri) { get; } | Ottiene l'URI dello spazio dei nomi di questo nodo. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling) { get; } | Ottiene il nodo immediatamente successivo a questo nodo. Se non esiste un tale nodo, restituisce null. |
| override [NodeName](../../aspose.finance.xbrl.dom/document/nodename) { get; } | Ottiene il nome del nodo del documento. |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype) { get; } | Ottiene il tipo di nodo. |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue) { get; set; } | Ottiene o imposta il valore di questo nodo, a seconda del tipo. |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument) { get; } | Ottiene l'oggetto documento associato a questo nodo. |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode) { get; } | Ottiene il nodo padre. |
| virtual [Prefix](../../aspose.finance.xbrl.dom/node/prefix) { get; set; } | Ottiene o imposta il prefisso dello spazio dei nomi di questo nodo. |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling) { get; } | Ottiene il nodo immediatamente precedente a questo nodo. Se non esiste un tale nodo, restituisce null. |
| [References](../../aspose.finance.xbrl.inline/inlinexbrldocument/references) { get; } | Ottiene il[`InlineReferences`](../inlinereferences) nel documento XBRL in linea. |
| [Relationships](../../aspose.finance.xbrl.inline/inlinexbrldocument/relationships) { get; } | Ottiene la raccolta di[`InlineRelationship`](../inlinerelationship) nel documento XBRL in linea. |
| [RoleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/rolereferences) { get; } | Ottiene la raccolta di[`RoleReference`](../../aspose.finance.xbrl/rolereference) nel documento XBRL in linea. |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent) { get; set; } | Ottiene o imposta il contenuto del testo di questo nodo e dei suoi discendenti. |
| [Units](../../aspose.finance.xbrl.inline/inlinexbrldocument/units) { get; } | Ottiene la raccolta di[`Unit`](../../aspose.finance.xbrl/unit) nel documento XBRL in linea. |
| [ValidationErrors](../../aspose.finance.xbrl.inline/inlinexbrldocument/validationerrors) { get; set; } | Ottiene la raccolta di[`ValidationError`](../../aspose.finance.xbrl.validator/validationerror) nel documento XBRL in linea. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild)(Node) | Aggiunge il nodo newChild alla fine dell'elenco dei figli di questo nodo. |
| [CreateHtmlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createhtmlelement)(string, string) | Crea un elemento HTML. |
| [CreateInlineXbrlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createinlinexbrlelement)(string, string) | Crea un elemento xbrl in linea. |
| [CreateXbrlInstanceElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrlinstanceelement)(string, string) | Crea un elemento di istanza xbrl. |
| [CreateXbrlLinkbaseElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrllinkbaseelement)(string, string) | Crea un elemento xbrl linkbase. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl)() | Esporta in oggetto XbrlDocument. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl_1)(Stream) | Esporta in stream xbrl. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl_2)(string) | Esporta in file xbrl. |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getarcroletypebyuri)(string) | Ottiene l'ArcroleType che ha l'uri specificato. |
| [GetConceptById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyid)(string) | Ottiene il contesto che ha l'id specificato. |
| [GetConceptByLoc](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyloc)(Loc) | Ottiene il concetto dal locator. |
| [GetConceptByName](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyname)(string) | Ottiene il concetto che ha il nome specificato. |
| [GetContextById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontextbyid)(string) | Ottiene il contesto che ha l'id specificato. |
| [GetContinuationChainByContinuationReference](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontinuationchainbycontinuationreference)(string) | Ottiene la catena di continuazione in base al riferimento di continuazione. |
| [GetRoleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getroletypebyuri)(string) | Ottiene il RoleType che ha l'uri. specificato |
| [GetUnitById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getunitbyid)(string) | Ottiene l'unità che ha l'id specificato. |
| [IsValid](../../aspose.finance.xbrl.inline/inlinexbrldocument/isvalid)() | Verifica se questo documento XBRL inlince è valido. |
| [RefreshInlineXbrlObjects](../../aspose.finance.xbrl.inline/inlinexbrldocument/refreshinlinexbrlobjects)() | Se aggiungi, aggiorna, rimuovi elementi Inline Xbrl nell'albero DOM, questo metodo dovrebbe essere chiamato per aggiornare gli oggetti xbrl inline. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild)(Node) | Rimuove il nodo figlio indicato da vecchio figlio dall'elenco dei figli. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild)(Node, Node) | Sostituisce il nodo figlio vecchio figlio con nuovo figlio nell'elenco dei figli e restituisce il vecchio nodo figlio. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save#save)(Stream) | Crea e salva il file xbrl inline nello stream. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save#save_1)(string) | Crea e salva il file xbrl inline sul disco. |
| [Validate](../../aspose.finance.xbrl.inline/inlinexbrldocument/validate)() | Convalida questo documento XBRL in linea. |

### Guarda anche

* class [Document](../../aspose.finance.xbrl.dom/document)
* spazio dei nomi [Aspose.Finance.Xbrl.Inline](../../aspose.finance.xbrl.inline)
* assemblea [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
