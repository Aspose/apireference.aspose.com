---
title: InlineXbrlDocument
second_title: Referencia de API de Aspose.Finance para .NET
description: Un documento XBRL en línea.
type: docs
weight: 7750
url: /es/net/aspose.finance.xbrl.inline/inlinexbrldocument/
---
## InlineXbrlDocument class

Un documento XBRL en línea.

```csharp
public class InlineXbrlDocument : Document
```

## Constructores

| Nombre | Descripción |
| --- | --- |
| [InlineXbrlDocument](inlinexbrldocument)(string) | Inicializa una nueva instancia de[`InlineXbrlDocument`](../inlinexbrldocument) clase y abra un archivo. |

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [ArcroleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/arcrolereferences) { get; } | Obtiene la colección de[`ArcroleReference`](../../aspose.finance.xbrl/arcrolereference) en el documento XBRL en línea. |
| virtual [BaseURI](../../aspose.finance.xbrl.dom/node/baseuri) { get; } | Obtiene el URI base absoluto de este nodo o nulo si la implementación no pudo obtener un URI absoluto. |
| [CharacterSet](../../aspose.finance.xbrl.dom/document/characterset) { get; } | Obtiene la codificación del documento. |
| [ChildElements](../../aspose.finance.xbrl.dom/document/childelements) { get; } | Obtiene los elementos secundarios. |
| [ChildNodes](../../aspose.finance.xbrl.dom/node/childnodes) { get; } | Obtiene los nodos secundarios. |
| [ContentType](../../aspose.finance.xbrl.dom/document/contenttype) { get; } | Obtiene el tipo de contenido del documento. |
| [Contexts](../../aspose.finance.xbrl.inline/inlinexbrldocument/contexts) { get; } | Obtiene la colección de[`Context`](../../aspose.finance.xbrl/context) en el documento XBRL en línea. |
| [Continuations](../../aspose.finance.xbrl.inline/inlinexbrldocument/continuations) { get; } | Obtiene la colección de[`InlineContinuation`](../inlinecontinuation) en el documento XBRL en línea. |
| [DocumentElement](../../aspose.finance.xbrl.dom/document/documentelement) { get; } | Este es un atributo de conveniencia que permite el acceso directo al nodo secundario que es el elemento de documento del documento. |
| [DocumentURI](../../aspose.finance.xbrl.dom/document/documenturi) { get; } | Obtiene el URI del documento. |
| [Facts](../../aspose.finance.xbrl.inline/inlinexbrldocument/facts) { get; } | Obtiene la colección de[`InlineFact`](../inlinefact) en el documento XBRL en línea. |
| [FirstChild](../../aspose.finance.xbrl.dom/node/firstchild) { get; } | Obtiene el primer hijo de este nodo. Si no existe tal nodo, esto devuelve nulo. |
| [Footnotes](../../aspose.finance.xbrl.inline/inlinexbrldocument/footnotes) { get; } | Obtiene la colección de[`InlineFootnote`](../inlinefootnote) en el documento XBRL en línea. |
| [HasChildNodes](../../aspose.finance.xbrl.dom/node/haschildnodes) { get; } | Obtiene si este nodo tiene hijos. |
| [LastChild](../../aspose.finance.xbrl.dom/node/lastchild) { get; } | Obtiene el último hijo de este nodo. Si no existe tal nodo, esto devuelve nulo. |
| virtual [LocalName](../../aspose.finance.xbrl.dom/node/localname) { get; } | Obtiene la parte local del nombre calificado de este nodo. |
| virtual [NamespaceURI](../../aspose.finance.xbrl.dom/node/namespaceuri) { get; } | Obtiene el URI del espacio de nombres de este nodo. |
| [NextSibling](../../aspose.finance.xbrl.dom/node/nextsibling) { get; } | Obtiene el nodo que sigue inmediatamente a este nodo. Si no existe tal nodo, esto devuelve nulo. |
| override [NodeName](../../aspose.finance.xbrl.dom/document/nodename) { get; } | Obtiene el nombre de nodo del documento. |
| [NodeType](../../aspose.finance.xbrl.dom/node/nodetype) { get; } | Obtiene el tipo de nodo. |
| virtual [NodeValue](../../aspose.finance.xbrl.dom/node/nodevalue) { get; set; } | Obtiene o establece el valor de este nodo, según su tipo. |
| [OwnerDocument](../../aspose.finance.xbrl.dom/node/ownerdocument) { get; } | Obtiene el objeto de documento asociado a este nodo. |
| [ParentNode](../../aspose.finance.xbrl.dom/node/parentnode) { get; } | Obtiene el nodo padre. |
| virtual [Prefix](../../aspose.finance.xbrl.dom/node/prefix) { get; set; } | Obtiene o establece el prefijo del espacio de nombres de este nodo. |
| [PreviousSibling](../../aspose.finance.xbrl.dom/node/previoussibling) { get; } | Obtiene el nodo inmediatamente anterior a este nodo. Si no existe tal nodo, esto devuelve nulo. |
| [References](../../aspose.finance.xbrl.inline/inlinexbrldocument/references) { get; } | Obtiene el[`InlineReferences`](../inlinereferences) en el documento XBRL en línea. |
| [Relationships](../../aspose.finance.xbrl.inline/inlinexbrldocument/relationships) { get; } | Obtiene la colección de[`InlineRelationship`](../inlinerelationship) en el documento XBRL en línea. |
| [RoleReferences](../../aspose.finance.xbrl.inline/inlinexbrldocument/rolereferences) { get; } | Obtiene la colección de[`RoleReference`](../../aspose.finance.xbrl/rolereference) en el documento XBRL en línea. |
| virtual [TextContent](../../aspose.finance.xbrl.dom/node/textcontent) { get; set; } | Obtiene o establece el contenido de texto de este nodo y sus descendientes. |
| [Units](../../aspose.finance.xbrl.inline/inlinexbrldocument/units) { get; } | Obtiene la colección de[`Unit`](../../aspose.finance.xbrl/unit) en el documento XBRL en línea. |
| [ValidationErrors](../../aspose.finance.xbrl.inline/inlinexbrldocument/validationerrors) { get; set; } | Obtiene la colección de[`ValidationError`](../../aspose.finance.xbrl.validator/validationerror) en el documento XBRL en línea. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [AppendChild](../../aspose.finance.xbrl.dom/node/appendchild)(Node) | Agrega el nodo newChild al final de la lista de hijos de este nodo. |
| [CreateHtmlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createhtmlelement)(string, string) | Crea un elemento Html. |
| [CreateInlineXbrlElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createinlinexbrlelement)(string, string) | Crea un elemento xbrl en línea. |
| [CreateXbrlInstanceElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrlinstanceelement)(string, string) | Crea un elemento de instancia xbrl. |
| [CreateXbrlLinkbaseElement](../../aspose.finance.xbrl.inline/inlinexbrldocument/createxbrllinkbaseelement)(string, string) | Crea un elemento base de enlace xbrl. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl)() | Exportar a objeto XbrlDocument. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl_1)(Stream) | Exportar a flujo xbrl. |
| [ExportToXbrl](../../aspose.finance.xbrl.inline/inlinexbrldocument/exporttoxbrl#exporttoxbrl_2)(string) | Exportar a archivo xbrl. |
| [GetArcroleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getarcroletypebyuri)(string) | Obtiene el ArcroleType que tiene el uri especificado. |
| [GetConceptById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyid)(string) | Obtiene el contexto que tiene el id especificado. |
| [GetConceptByLoc](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyloc)(Loc) | Obtiene el concepto por el localizador. |
| [GetConceptByName](../../aspose.finance.xbrl.inline/inlinexbrldocument/getconceptbyname)(string) | Obtiene el concepto que tiene el nombre especificado. |
| [GetContextById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontextbyid)(string) | Obtiene el contexto que tiene el id especificado. |
| [GetContinuationChainByContinuationReference](../../aspose.finance.xbrl.inline/inlinexbrldocument/getcontinuationchainbycontinuationreference)(string) | Obtiene la cadena de continuación según la referencia de continuación. |
| [GetRoleTypeByURI](../../aspose.finance.xbrl.inline/inlinexbrldocument/getroletypebyuri)(string) | Obtiene el RoleType que tiene el uri especificado. |
| [GetUnitById](../../aspose.finance.xbrl.inline/inlinexbrldocument/getunitbyid)(string) | Obtiene la unidad que tiene el id especificado. |
| [IsValid](../../aspose.finance.xbrl.inline/inlinexbrldocument/isvalid)() | Comprueba si este documento inlince XBRL es válido. |
| [RefreshInlineXbrlObjects](../../aspose.finance.xbrl.inline/inlinexbrldocument/refreshinlinexbrlobjects)() | Si agrega, actualiza, elimina elementos Inline Xbrl en el árbol DOM, se debe llamar a este método para actualizar los objetos inline xbrl. |
| [RemoveChild](../../aspose.finance.xbrl.dom/node/removechild)(Node) | Elimina el nodo hijo indicado por hijo antiguo de la lista de hijos. |
| [ReplaceChild](../../aspose.finance.xbrl.dom/node/replacechild)(Node, Node) | Reemplaza el nodo secundario antiguo con el nuevo secundario en la lista de secundarios y devuelve el antiguo nodo secundario. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save#save)(Stream) | Crea y guarda el archivo xbrl en línea en la secuencia. |
| [Save](../../aspose.finance.xbrl.inline/inlinexbrldocument/save#save_1)(string) | Crea y guarda el archivo xbrl en línea en el disco. |
| [Validate](../../aspose.finance.xbrl.inline/inlinexbrldocument/validate)() | Valida este documento XBRL en línea. |

### Ver también

* class [Document](../../aspose.finance.xbrl.dom/document)
* espacio de nombres [Aspose.Finance.Xbrl.Inline](../../aspose.finance.xbrl.inline)
* asamblea [Aspose.Finance](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Finance.dll -->
