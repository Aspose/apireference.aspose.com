---
title: "classe System::Xml::XPath::XPathNavigator"
linktitle: "XPathNavigator"
second_title: "Aspose.Font per C++"
description: "classe System::Xml::XPath::XPathNavigator. Fornisce un modello di cursore per navigare e modificare dati XML in C++."
type: docs
weight: 500
url: /it/cpp/system.xml.xpath/xpathnavigator/
---
## XPathNavigator class


Fornisce un modello di cursore per navigare e modificare i dati XML.

```cpp
class XPathNavigator : public System::Xml::XPath::XPathItem,
                       public System::Xml::XPath::IXPathNavigable,
                       public System::Xml::IXmlNamespaceResolver
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [AppendChild](./appendchild/)() | Restituisce un oggetto [XmlWriter](../../system.xml/xmlwriter/) utilizzato per creare uno o più nuovi nodi figlio alla fine dell'elenco dei nodi figlio del nodo corrente. |
| virtual [AppendChild](./appendchild/)(String) | Crea un nuovo nodo figlio alla fine dell'elenco dei nodi figlio del nodo corrente utilizzando la stringa di dati XML specificata. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlReader\>) | Crea un nuovo nodo figlio alla fine dell'elenco dei nodi figlio del nodo corrente utilizzando il contenuto XML dell'oggetto [XmlReader](../../system.xml/xmlreader/) specificato. |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XPathNavigator\>) | Crea un nuovo nodo figlio alla fine dell'elenco dei nodi figlio del nodo corrente utilizzando i nodi del [XPathNavigator](./) specificato. |
| virtual [AppendChildElement](./appendchildelement/)(String, String, String, String) | Crea un nuovo nodo elemento figlio alla fine dell'elenco dei nodi figlio del nodo corrente utilizzando il prefisso di namespace, il nome locale e l'URI di namespace specificati con il valore indicato. |
| virtual [CheckValidity](./checkvalidity/)(SharedPtr\<System::Xml::Schema::XmlSchemaSet\>, System::Xml::Schema::ValidationEventHandler) | Verifica che i dati XML nel [XPathNavigator](./) siano conformi al linguaggio di definizione XML [Schema](../../system.xml.schema/) (XSD) fornito. |
| virtual [Clone](./clone/)() | Quando sovrascritto in una classe derivata, crea un nuovo [XPathNavigator](./) posizionato sullo stesso nodo di questo [XPathNavigator](./). |
| virtual [ComparePosition](./compareposition/)(SharedPtr\<XPathNavigator\>) | Confronta la posizione del [XPathNavigator](./) corrente con la posizione del [XPathNavigator](./) specificato. |
| virtual [Compile](./compile/)(String) | Compila una stringa che rappresenta un'espressione [XPath](../) e restituisce un oggetto [XPathExpression](../xpathexpression/). |
| virtual [CreateAttribute](./createattribute/)(String, String, String, String) | Crea un nodo attributo sul nodo elemento corrente utilizzando il prefisso di spazio dei nomi, il nome locale e l'URI dello spazio dei nomi specificati con il valore indicato. |
| virtual [CreateAttributes](./createattributes/)() | Restituisce un oggetto [XmlWriter](../../system.xml/xmlwriter/) utilizzato per creare nuovi attributi sull'elemento corrente. |
| [CreateNavigator](./createnavigator/)() override | Restituisce una copia del [XPathNavigator](./). |
| virtual [DeleteRange](./deleterange/)(SharedPtr\<XPathNavigator\>) | Elimina un intervallo di nodi fratelli dal nodo corrente fino al nodo specificato. |
| virtual [DeleteSelf](./deleteself/)() | Elimina il nodo corrente e i suoi nodi figlio. |
| virtual [Evaluate](./evaluate/)(String) | Valuta l'espressione [XPath](../) specificata e restituisce il risultato tipizzato. |
| virtual [Evaluate](./evaluate/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Valuta l'espressione [XPath](../) specificata e restituisce il risultato tipizzato, utilizzando l'oggetto [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) specificato per risolvere i prefissi di spazio dei nomi nell'espressione [XPath](../). |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>) | Valuta il [XPathExpression](../xpathexpression/) e restituisce il risultato tipizzato. |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) | Utilizza il contesto fornito per valutare il [XPathExpression](../xpathexpression/) e restituisce il risultato tipizzato. |
| virtual [get_BaseURI](./get_baseuri/)() | Quando sovrascritto in una classe derivata, ottiene l'URI di base per il nodo corrente. |
| virtual [get_CanEdit](./get_canedit/)() | Restituisce un valore che indica se il [XPathNavigator](./) può modificare i dati XML sottostanti. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Restituisce un valore che indica se il nodo corrente possiede attributi. |
| virtual [get_HasChildren](./get_haschildren/)() | Restituisce un valore che indica se il nodo corrente possiede nodi figlio. |
| virtual [get_InnerXml](./get_innerxml/)() | Restituisce il markup che rappresenta i nodi figlio del nodo corrente. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | Quando sovrascritto in una classe derivata, ottiene un valore che indica se il nodo corrente è un elemento vuoto senza un tag di chiusura. |
| [get_IsNode](./get_isnode/)() override | Restituisce un valore che indica se il nodo corrente rappresenta un nodo [XPath](../). |
| virtual [get_LocalName](./get_localname/)() | Quando sovrascritto in una classe derivata, ottiene il [XPathNavigator::get_Name](./get_name/) del nodo corrente senza alcun prefisso di spazio dei nomi. |
| virtual [get_Name](./get_name/)() | Quando sovrascritto in una classe derivata, ottiene il nome qualificato del nodo corrente. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Quando sovrascritto in una classe derivata, ottiene l'URI dello spazio dei nomi del nodo corrente. |
| virtual [get_NameTable](./get_nametable/)() | Quando sovrascritto in una classe derivata, ottiene il [XmlNameTable](../../system.xml/xmlnametable/) del [XPathNavigator](./). |
| static [get_NavigatorComparer](./get_navigatorcomparer/)() | Restituisce un [Collections::IEqualityComparer](../../system.collections/iequalitycomparer/) utilizzato per il confronto di uguaglianza degli oggetti [XPathNavigator](./). |
| virtual [get_NodeType](./get_nodetype/)() | Quando sovrascritto in una classe derivata, ottiene il [XPathNodeType](../xpathnodetype/) del nodo corrente. |
| virtual [get_OuterXml](./get_outerxml/)() | Restituisce il markup che rappresenta i tag di apertura e chiusura del nodo corrente e dei suoi nodi figlio. |
| virtual [get_Prefix](./get_prefix/)() | Quando sovrascritto in una classe derivata, ottiene il prefisso dello spazio dei nomi associato al nodo corrente. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Restituisce le informazioni dello schema che sono state assegnate al nodo corrente a seguito della convalida dello schema. |
| [get_TypedValue](./get_typedvalue/)() override | Restituisce il nodo corrente come oggetto boxed del tipo più appropriato. |
| virtual [get_UnderlyingObject](./get_underlyingobject/)() | Utilizzato dalle implementazioni di [XPathNavigator](./) che forniscono una vista XML "virtualizzata" su un archivio, per fornire l'accesso agli oggetti sottostanti. |
| [get_ValueAsBoolean](./get_valueasboolean/)() override | Restituisce il valore del nodo corrente come un [Boolean](../../system/boolean/). |
| [get_ValueAsDateTime](./get_valueasdatetime/)() override | Restituisce il valore del nodo corrente come un [DateTime](../../system/datetime/). |
| [get_ValueAsDouble](./get_valueasdouble/)() override | Restituisce il valore del nodo corrente come un [Double](../../system/double/). |
| [get_ValueAsInt](./get_valueasint/)() override | Restituisce il valore del nodo corrente come un [Int32](../../system/int32/). |
| [get_ValueAsLong](./get_valueaslong/)() override | Restituisce il valore del nodo corrente come un [Int64](../../system/int64/). |
| [get_ValueType](./get_valuetype/)() override | Restituisce il tipo del nodo corrente. |
| virtual [get_XmlLang](./get_xmllang/)() | Restituisce l'ambito **xml:lang** per il nodo corrente. |
| [get_XmlType](./get_xmltype/)() override | Restituisce le informazioni XmlSchemaType per il nodo corrente. |
| virtual [GetAttribute](./getattribute/)(String, String) | Restituisce il valore dell'attributo con il nome locale e l'URI dello spazio dei nomi specificati. |
| virtual [GetNamespace](./getnamespace/)(String) | Restituisce il valore del nodo di spazio dei nomi corrispondente al nome locale specificato. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | Restituisce gli spazi dei nomi in ambito del nodo corrente. |
| virtual [InsertAfter](./insertafter/)() | Restituisce un oggetto [XmlWriter](../../system.xml/xmlwriter/) utilizzato per creare un nuovo nodo fratello dopo il nodo attualmente selezionato. |
| virtual [InsertAfter](./insertafter/)(String) | Crea un nuovo nodo fratello dopo il nodo attualmente selezionato usando la stringa XML specificata. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlReader\>) | Crea un nuovo nodo fratello dopo il nodo attualmente selezionato usando il contenuto XML dell'oggetto [XmlReader](../../system.xml/xmlreader/) specificato. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XPathNavigator\>) | Crea un nuovo nodo fratello dopo il nodo attualmente selezionato usando i nodi nell'oggetto [XPathNavigator](./) specificato. |
| virtual [InsertBefore](./insertbefore/)() | Restituisce un oggetto [XmlWriter](../../system.xml/xmlwriter/) utilizzato per creare un nuovo nodo fratello prima del nodo attualmente selezionato. |
| virtual [InsertBefore](./insertbefore/)(String) | Crea un nuovo nodo fratello prima del nodo attualmente selezionato usando la stringa XML specificata. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlReader\>) | Crea un nuovo nodo fratello prima del nodo attualmente selezionato usando il contenuto XML dell'oggetto [XmlReader](../../system.xml/xmlreader/) specificato. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XPathNavigator\>) | Crea un nuovo nodo fratello prima del nodo attualmente selezionato usando i nodi nel [XPathNavigator](./) specificato. |
| virtual [InsertElementAfter](./insertelementafter/)(String, String, String, String) | Crea un nuovo elemento fratello dopo il nodo corrente usando il prefisso di spazio dei nomi, il nome locale e l'URI di spazio dei nomi specificati, con il valore specificato. |
| virtual [InsertElementBefore](./insertelementbefore/)(String, String, String, String) | Crea un nuovo elemento fratello prima del nodo corrente usando il prefisso di spazio dei nomi, il nome locale e l'URI di spazio dei nomi specificati, con il valore specificato. |
| virtual [IsDescendant](./isdescendant/)(SharedPtr\<XPathNavigator\>) | Determina se il [XPathNavigator](./) specificato è un discendente del [XPathNavigator](./) corrente. |
| virtual [IsSamePosition](./issameposition/)(SharedPtr\<XPathNavigator\>) | Quando sovrascritto in una classe derivata, determina se il [XPathNavigator](./) corrente è nella stessa posizione del [XPathNavigator](./) specificato. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | Restituisce l'URI dello spazio dei nomi per il prefisso specificato. |
| [LookupPrefix](./lookupprefix/)(const String\&) override | Restituisce il prefisso dichiarato per l'URI di spazio dei nomi specificato. |
| virtual [Matches](./matches/)(SharedPtr\<XPathExpression\>) | Determina se il nodo corrente corrisponde all'[XPathExpression](../xpathexpression/) specificato. |
| virtual [Matches](./matches/)(String) | Determina se il nodo corrente corrisponde all'espressione [XPath](../) specificata. |
| virtual [MoveTo](./moveto/)(SharedPtr\<XPathNavigator\>) | Quando sovrascritto in una classe derivata, sposta il [XPathNavigator](./) nella stessa posizione del [XPathNavigator](./) specificato. |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | Sposta il [XPathNavigator](./) all'attributo con il nome locale e l'URI dello spazio dei nomi corrispondenti. |
| virtual [MoveToChild](./movetochild/)(String, String) | Sposta il [XPathNavigator](./) al nodo figlio con il nome locale e l'URI dello spazio dei nomi specificati. |
| virtual [MoveToChild](./movetochild/)(XPathNodeType) | Sposta il [XPathNavigator](./) al nodo figlio del [XPathNodeType](../xpathnodetype/) specificato. |
| virtual [MoveToFirst](./movetofirst/)() | Sposta il [XPathNavigator](./) al primo nodo fratello del nodo corrente. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | Quando sovrascritto in una classe derivata, sposta il [XPathNavigator](./) al primo attributo del nodo corrente. |
| virtual [MoveToFirstChild](./movetofirstchild/)() | Quando sovrascritto in una classe derivata, sposta il [XPathNavigator](./) al primo nodo figlio del nodo corrente. |
| virtual [MoveToFirstNamespace](./movetofirstnamespace/)(XPathNamespaceScope) | Quando sovrascritto in una classe derivata, sposta il [XPathNavigator](./) al primo nodo di spazio dei nomi che corrisponde al [XPathNamespaceScope](../xpathnamespacescope/) specificato. |
| [MoveToFirstNamespace](./movetofirstnamespace/)() | Sposta il [XPathNavigator](./) al primo nodo di spazio dei nomi del nodo corrente. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String) | Sposta il [XPathNavigator](./) all'elemento con il nome locale e l'URI dello spazio dei nomi specificati nell'ordine del documento. |
| virtual [MoveToFollowing](./movetofollowing/)(String, String, SharedPtr\<XPathNavigator\>) | Sposta il [XPathNavigator](./) all'elemento con il nome locale e l'URI dello spazio dei nomi specificati, al limite specificato, nell'ordine del documento. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType) | Sposta il [XPathNavigator](./) all'elemento successivo del [XPathNodeType](../xpathnodetype/) specificato nell'ordine del documento. |
| virtual [MoveToFollowing](./movetofollowing/)(XPathNodeType, SharedPtr\<XPathNavigator\>) | Sposta il [XPathNavigator](./) all'elemento successivo del [XPathNodeType](../xpathnodetype/) specificato, al limite specificato, nell'ordine del documento. |
| virtual [MoveToId](./movetoid/)(String) | Quando sovrascritto in una classe derivata, sposta al nodo che ha un attributo di tipo **ID** il cui valore corrisponde al [String](../../system/string/) specificato. |
| virtual [MoveToNamespace](./movetonamespace/)(String) | Sposta il [XPathNavigator](./) al nodo di spazio dei nomi con il prefisso di spazio dei nomi specificato. |
| virtual [MoveToNext](./movetonext/)() | Quando sovrascritto in una classe derivata, sposta il [XPathNavigator](./) al nodo fratello successivo del nodo corrente. |
| virtual [MoveToNext](./movetonext/)(String, String) | Sposta il [XPathNavigator](./) al nodo fratello successivo con il nome locale e l'URI dello spazio dei nomi specificati. |
| virtual [MoveToNext](./movetonext/)(XPathNodeType) | Sposta il [XPathNavigator](./) al nodo fratello successivo del nodo corrente che corrisponde al [XPathNodeType](../xpathnodetype/) specificato. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | Quando sovrascritto in una classe derivata, sposta il [XPathNavigator](./) al prossimo attributo. |
| virtual [MoveToNextNamespace](./movetonextnamespace/)(XPathNamespaceScope) | Quando sovrascritto in una classe derivata, sposta il [XPathNavigator](./) al prossimo nodo di spazio dei nomi che corrisponde al [XPathNamespaceScope](../xpathnamespacescope/) specificato. |
| [MoveToNextNamespace](./movetonextnamespace/)() | Sposta il [XPathNavigator](./) al prossimo nodo di spazio dei nomi. |
| virtual [MoveToParent](./movetoparent/)() | Quando sovrascritto in una classe derivata, sposta il [XPathNavigator](./) al nodo genitore del nodo corrente. |
| virtual [MoveToPrevious](./movetoprevious/)() | Quando sovrascritto in una classe derivata, sposta il [XPathNavigator](./) al nodo fratello precedente del nodo corrente. |
| virtual [MoveToRoot](./movetoroot/)() | Sposta il [XPathNavigator](./) al nodo radice a cui appartiene il nodo corrente. |
| virtual [PrependChild](./prependchild/)() | Restituisce un oggetto [XmlWriter](../../system.xml/xmlwriter/) utilizzato per creare un nuovo nodo figlio all'inizio dell'elenco dei nodi figlio del nodo corrente. |
| virtual [PrependChild](./prependchild/)(String) | Crea un nuovo nodo figlio all'inizio dell'elenco dei nodi figlio del nodo corrente utilizzando la stringa XML specificata. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlReader\>) | Crea un nuovo nodo figlio all'inizio dell'elenco dei nodi figlio del nodo corrente utilizzando il contenuto XML dell'oggetto [XmlReader](../../system.xml/xmlreader/) specificato. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XPathNavigator\>) | Crea un nuovo nodo figlio all'inizio dell'elenco dei nodi figlio del nodo corrente utilizzando i nodi dell'oggetto [XPathNavigator](./) specificato. |
| virtual [PrependChildElement](./prependchildelement/)(String, String, String, String) | Crea un nuovo elemento figlio all'inizio dell'elenco dei nodi figlio del nodo corrente utilizzando il prefisso di spazio dei nomi, il nome locale e l'URI dello spazio dei nomi specificati con il valore indicato. |
| virtual [ReadSubtree](./readsubtree/)() | Restituisce un oggetto [XmlReader](../../system.xml/xmlreader/) che contiene il nodo corrente e i suoi nodi figlio. |
| virtual [ReplaceRange](./replacerange/)(SharedPtr\<XPathNavigator\>) | Sostituisce un intervallo di nodi fratelli dal nodo corrente al nodo specificato. |
| virtual [ReplaceSelf](./replaceself/)(String) | Sostituisce il nodo corrente con il contenuto della stringa specificata. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XmlReader\>) | Sostituisce il nodo corrente con il contenuto dell'oggetto [XmlReader](../../system.xml/xmlreader/) specificato. |
| virtual [ReplaceSelf](./replaceself/)(SharedPtr\<XPathNavigator\>) | Sostituisce il nodo corrente con il contenuto dell'oggetto [XPathNavigator](./) specificato. |
| virtual [Select](./select/)(String) | Seleziona un insieme di nodi, utilizzando l'espressione [XPath](../) specificata. |
| virtual [Select](./select/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Seleziona un insieme di nodi utilizzando l'espressione [XPath](../) specificata con l'oggetto [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) specificato per risolvere i prefissi di spazio dei nomi. |
| virtual [Select](./select/)(SharedPtr\<XPathExpression\>) | Seleziona un insieme di nodi utilizzando la [XPathExpression](../xpathexpression/) specificata. |
| virtual [SelectAncestors](./selectancestors/)(XPathNodeType, bool) | Seleziona tutti i nodi antenati del nodo corrente che corrispondono al [XPathNodeType](../xpathnodetype/). |
| virtual [SelectAncestors](./selectancestors/)(String, String, bool) | Seleziona tutti i nodi antenati del nodo corrente che hanno il nome locale e l'URI dello spazio dei nomi specificati. |
| virtual [SelectChildren](./selectchildren/)(XPathNodeType) | Seleziona tutti i nodi figlio del nodo corrente che corrispondono al [XPathNodeType](../xpathnodetype/). |
| virtual [SelectChildren](./selectchildren/)(String, String) | Seleziona tutti i nodi figlio del nodo corrente che hanno il nome locale e l'URI dello spazio dei nomi specificati. |
| virtual [SelectDescendants](./selectdescendants/)(XPathNodeType, bool) | Seleziona tutti i nodi discendenti del nodo corrente che corrispondono al [XPathNodeType](../xpathnodetype/). |
| virtual [SelectDescendants](./selectdescendants/)(String, String, bool) | Seleziona tutti i nodi discendenti del nodo corrente con il nome locale e l'URI dello spazio dei nomi specificati. |
| virtual [SelectSingleNode](./selectsinglenode/)(String) | Seleziona un singolo nodo nel [XPathNavigator](./) utilizzando la query [XPath](../) specificata. |
| virtual [SelectSingleNode](./selectsinglenode/)(String, SharedPtr\<IXmlNamespaceResolver\>) | Seleziona un singolo nodo nell'oggetto [XPathNavigator](./) utilizzando la query [XPath](../) specificata con l'oggetto [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) specificato per risolvere i prefissi di spazio dei nomi. |
| virtual [SelectSingleNode](./selectsinglenode/)(SharedPtr\<XPathExpression\>) | Seleziona un singolo nodo nel [XPathNavigator](./) utilizzando l'oggetto [XPathExpression](../xpathexpression/) specificato. |
| virtual [set_InnerXml](./set_innerxml/)(String) | Imposta il markup che rappresenta i nodi figlio del nodo corrente. |
| virtual [set_OuterXml](./set_outerxml/)(String) | Imposta il markup che rappresenta i tag di apertura e chiusura del nodo corrente e dei suoi nodi figlio. |
| virtual [SetTypedValue](./settypedvalue/)(SharedPtr\<Object\>) | Imposta il valore tipizzato del nodo corrente. |
| virtual [SetValue](./setvalue/)(String) | Imposta il valore del nodo corrente. |
| [ToString](./tostring/)() const override | Restituisce il valore di testo del nodo corrente. |
| [ValueAs](./valueas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) override | Restituisce il valore del nodo corrente come il Tipo specificato, utilizzando l'oggetto [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/) specificato per risolvere i prefissi di spazio dei nomi. |
| virtual [WriteSubtree](./writesubtree/)(SharedPtr\<XmlWriter\>) | Trasmette il nodo corrente e i suoi nodi figli all'oggetto [XmlWriter](../../system.xml/xmlwriter/) specificato. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Vedi anche

* Class [XPathItem](../xpathitem/)
* Class [IXPathNavigable](../ixpathnavigable/)
* Class [IXmlNamespaceResolver](../../system.xml/ixmlnamespaceresolver/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
