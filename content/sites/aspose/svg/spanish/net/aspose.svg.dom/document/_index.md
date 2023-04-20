---
title: Class Document
second_title: Referencia de API de Aspose.SVG para .NET
description: Aspose.Svg.Dom.Document clase. El Documento representa todo el documento HTML XML o SVG. Conceptualmente es la raíz del árbol del documento y proporciona el acceso principal a los datos del documento.
type: docs
weight: 810
url: /es/net/aspose.svg.dom/document/
---
## Document class

El Documento representa todo el documento HTML, XML o SVG. Conceptualmente, es la raíz del árbol del documento y proporciona el acceso principal a los datos del documento.

```csharp
public class Document : Node, IDocumentEvent, IDocumentStyle, IDocumentTraversal, 
    IGlobalEventHandlers, INonElementParentNode, IParentNode, IXPathEvaluator
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| virtual [Attributes](../../aspose.svg.dom/node/attributes/) { get; } | Un NamedNodeMap que contiene los atributos de este nodo (si es un Elemento) o nulo en caso contrario. |
| override [BaseURI](../../aspose.svg.dom/document/baseuri/) { get; } | El URI base absoluto de este nodo o nulo si la implementación no pudo obtener un URI absoluto. |
| [CharacterSet](../../aspose.svg.dom/document/characterset/) { get; } | Obtiene la codificación del documento. |
| [Charset](../../aspose.svg.dom/document/charset/) { get; } | Obtiene la codificación del documento. |
| [ChildElementCount](../../aspose.svg.dom/document/childelementcount/) { get; } | Devuelve el número actual de nodos de elementos que son hijos de este elemento. 0 si este elemento no tiene nodos secundarios que sean de nodeType 1. |
| [ChildNodes](../../aspose.svg.dom/node/childnodes/) { get; } | Una lista de nodos que contiene todos los elementos secundarios de este nodo. Si no hay hijos, esta es una lista de nodos que no contiene nodos.. |
| [Children](../../aspose.svg.dom/document/children/) { get; } | Devuelve los elementos secundarios. |
| [ContentType](../../aspose.svg.dom/document/contenttype/) { get; } | Obtiene el tipo de contenido del documento. |
| [Context](../../aspose.svg.dom/document/context/) { get; } | Obtiene el contexto de navegación actual. |
| [DefaultView](../../aspose.svg.dom/document/defaultview/) { get; } | El atributo defaultView IDL de la interfaz del Documento, al obtenerlo, debe devolver el objeto WindowProxy del contexto de navegación de este Documento, si este Documento tiene un contexto de navegación asociado, o nulo en caso contrario. |
| [Doctype](../../aspose.svg.dom/document/doctype/) { get; } | La declaración de tipo de documento asociada con este documento. |
| [DocumentElement](../../aspose.svg.dom/document/documentelement/) { get; } | Este es un atributo conveniente que permite el acceso directo al nodo secundario que es el elemento de documento del documento. |
| [DocumentURI](../../aspose.svg.dom/document/documenturi/) { get; } | La ubicación del documento o nulo si no está definido o si el documento se creó mediante DOMImplementation.createDocument. |
| [FirstChild](../../aspose.svg.dom/node/firstchild/) { get; } | El primer hijo de este nodo. Si no existe tal nodo, esto devuelve nulo. |
| [FirstElementChild](../../aspose.svg.dom/document/firstelementchild/) { get; } | Devuelve el primer nodo del elemento secundario de este elemento. nulo si este elemento no tiene elementos secundarios. |
| [Implementation](../../aspose.svg.dom/document/implementation/) { get; } | El objeto DOMImplementation que maneja este documento. |
| [InputEncoding](../../aspose.svg.dom/document/inputencoding/) { get; } | Obtiene la codificación del documento. |
| [LastChild](../../aspose.svg.dom/node/lastchild/) { get; } | El último hijo de este nodo. Si no existe tal nodo, esto devuelve nulo. |
| [LastElementChild](../../aspose.svg.dom/document/lastelementchild/) { get; } | Devuelve el último nodo del elemento secundario de este elemento. nulo si este elemento no tiene elementos secundarios. |
| virtual [LocalName](../../aspose.svg.dom/node/localname/) { get; } | Devuelve la parte local del nombre calificado de este nodo. Para los nodos de cualquier tipo que no sean ELEMENT_NODE y ATTRIBUTE_NODE y los nodos creados con un método DOM Nivel 1, como Document.createElement(), esto siempre es nulo. |
| [Location](../../aspose.svg.dom/document/location/) { get; } | La ubicación del documento. |
| virtual [NamespaceURI](../../aspose.svg.dom/node/namespaceuri/) { get; } | El URI del espacio de nombres de este nodo, o nulo si no se especifica. |
| [NextElementSibling](../../aspose.svg.dom/document/nextelementsibling/) { get; } | Devuelve el siguiente nodo de elemento hermano de este elemento. nulo si este elemento no tiene nodos hermanos del elemento que vienen después de este en el árbol del documento. |
| [NextSibling](../../aspose.svg.dom/node/nextsibling/) { get; } | El nodo que sigue inmediatamente a este nodo. Si no existe tal nodo, esto devuelve nulo. |
| override [NodeName](../../aspose.svg.dom/document/nodename/) { get; } | El nombre de este nodo, dependiendo de su tipo. |
| override [NodeType](../../aspose.svg.dom/document/nodetype/) { get; } | Un código que representa el tipo del objeto subyacente. |
| virtual [NodeValue](../../aspose.svg.dom/node/nodevalue/) { get; set; } | El valor de este nodo, según su tipo. |
| [Origin](../../aspose.svg.dom/document/origin/) { get; } | Obtiene el origen del documento. |
| override [OwnerDocument](../../aspose.svg.dom/document/ownerdocument/) { get; } | Obtiene el documento del propietario. |
| [ParentElement](../../aspose.svg.dom/node/parentelement/) { get; } | Obtiene el padre[`Element`](../element/) de este nodo. |
| [ParentNode](../../aspose.svg.dom/node/parentnode/) { get; } | El padre de este nodo. Todos los nodos, excepto Attr, Document, DocumentFragment, Entity y Notation pueden tener un padre. Sin embargo, si se acaba de crear un nodo y aún no se ha agregado al árbol, o si se ha eliminado del árbol, este es nulo. |
| virtual [Prefix](../../aspose.svg.dom/node/prefix/) { get; set; } | El prefijo del espacio de nombres de este nodo, o nulo si no se especifica. Cuando se define como nulo, configurarlo no tiene efecto |
| [PreviousElementSibling](../../aspose.svg.dom/document/previouselementsibling/) { get; } | Devuelve el nodo de elemento hermano anterior de este elemento. nulo si este elemento no tiene nodos hermanos que estén antes de este en el árbol del documento. |
| [PreviousSibling](../../aspose.svg.dom/node/previoussibling/) { get; } | El nodo inmediatamente anterior a este nodo. Si no existe tal nodo, esto devuelve nulo. |
| [ReadyState](../../aspose.svg.dom/document/readystate/) { get; } | Devuelve la preparación del documento. La "carga" mientras se carga el documento, "interactiva" una vez que finaliza el análisis pero sigue cargando subrecursos, y "completa" una vez que se ha cargado. |
| [StrictErrorChecking](../../aspose.svg.dom/document/stricterrorchecking/) { get; set; } | Un atributo que especifica si se aplica o no la comprobación de errores. Cuando se establece en falso, la implementación es libre de no probar todos los casos de error posibles normalmente definidos en las operaciones DOM, y no generar ninguna DOMException en las operaciones DOM o informar errores al usar Document.normalizeDocument(). En caso de error, el comportamiento es indefinido. Este atributo es verdadero por defecto. |
| [StyleSheets](../../aspose.svg.dom/document/stylesheets/) { get; } | Una lista que contiene todas las hojas de estilo explícitamente vinculadas o incrustadas en un documento. Para documentos HTML, esto incluye hojas de estilo externas, incluidas a través del elemento HTML LINK y elementos STYLE en línea. |
| virtual [TextContent](../../aspose.svg.dom/node/textcontent/) { get; set; } | Este atributo devuelve el contenido de texto de este nodo y sus descendientes. Cuando se define como nulo, establecerlo no tiene ningún efecto. En la configuración, se eliminan todos los posibles elementos secundarios que este nodo pueda tener y, si la nueva cadena no está vacía o es nula, se reemplaza por un solo nodo de texto que contiene la cadena en la que se establece este atributo. |
| [XmlStandalone](../../aspose.svg.dom/document/xmlstandalone/) { get; set; } | Un atributo que especifica, como parte de la declaración XML, si este documento es independiente. Esto es falso cuando no se especifica. |
| [XmlVersion](../../aspose.svg.dom/document/xmlversion/) { get; set; } | Un atributo que especifica, como parte de la declaración XML, el número de versión de este documento. Si no hay declaración y si este documento admite la función "XML", el valor es "1.0". Si este documento no es compatible con la función "XML", el valor siempre es nulo. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener) | Este método permite el registro de detectores de eventos en el destino del evento. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, DOMEventHandler, bool) | Este método permite el registro de detectores de eventos en el destino del evento. |
| [AddEventListener](../../aspose.svg.dom/eventtarget/addeventlistener/)(string, IEventListener, bool) | Este método permite el registro de detectores de eventos en el destino del evento. |
| [AppendChild](../../aspose.svg.dom/node/appendchild/)(Node) | Agrega el nodo newChild al final de la lista de hijos de este nodo. Si newChild ya está en el árbol, primero se elimina. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)() | Devuelve un duplicado de este nodo, es decir, sirve como constructor de copia genérico para nodos. El nodo duplicado no tiene padre (parentNode es nulo) y no tiene datos de usuario. |
| [CloneNode](../../aspose.svg.dom/node/clonenode/)(bool) | Devuelve un duplicado de este nodo, es decir, sirve como constructor de copia genérico para nodos. El nodo duplicado no tiene padre (parentNode es nulo) y no tiene datos de usuario. |
| [CreateAttribute](../../aspose.svg.dom/document/createattribute/)(string) | Crea un Attr del nombre dado. |
| [CreateAttributeNS](../../aspose.svg.dom/document/createattributens/)(string, string) | Crea un atributo del nombre calificado y el URI del espacio de nombres proporcionados. |
| [CreateCDATASection](../../aspose.svg.dom/document/createcdatasection/)(string) | Crea un nodo CDATASection cuyo valor es la cadena especificada. |
| [CreateComment](../../aspose.svg.dom/document/createcomment/)(string) | Crea un nodo de comentario dada la cadena especificada. |
| [CreateDocumentFragment](../../aspose.svg.dom/document/createdocumentfragment/)() | Crea un objeto DocumentFragment vacío. |
| [CreateDocumentType](../../aspose.svg.dom/document/createdocumenttype/)(string, string, string, string) | Crea un nodo DocumentType. |
| [CreateElement](../../aspose.svg.dom/document/createelement/)(string) | Crea un elemento del tipo especificado. Tenga en cuenta que la instancia devuelta implementa la interfaz Element, por lo que los atributos se pueden especificar directamente en el objeto devuelto. |
| [CreateElementNS](../../aspose.svg.dom/document/createelementns/)(string, string) | Crea un elemento del nombre calificado y el URI del espacio de nombres proporcionados. |
| [CreateEntityReference](../../aspose.svg.dom/document/createentityreference/)(string) | Crea un objeto EntityReference. Además, si se conoce la entidad a la que se hace referencia, la lista secundaria del nodo EntityReference se hace igual que la del nodo Entity correspondiente. |
| [CreateEvent](../../aspose.svg.dom/document/createevent/)(string) | Crea un[`Event`](../../aspose.svg.dom.events/event/) de un tipo soportado por la implementación. |
| [CreateExpression](../../aspose.svg.dom/document/createexpression/)(string, IXPathNSResolver) | Crea una expresión XPath analizada con espacios de nombres resueltos. Esto es útil cuando se va a reutilizar una expresión en una aplicación, ya que permite compilar la cadena de expresión en un formato interno más eficiente y preresolver todos los prefijos de espacio de nombres que se producen dentro de la expresión. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator)(Node) | Crear un nuevo NodeIterator sobre el subárbol enraizado en el nodo especificado. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator_1)(Node, long) | Crear un nuevo NodeIterator sobre el subárbol enraizado en el nodo especificado. |
| [CreateNodeIterator](../../aspose.svg.dom/document/createnodeiterator/#createnodeiterator_2)(Node, long, INodeFilter) | Crear un nuevo NodeIterator sobre el subárbol enraizado en el nodo especificado. |
| [CreateNSResolver](../../aspose.svg.dom/document/creatensresolver/)(Node) | Adapta cualquier nodo DOM para resolver espacios de nombres de modo que una expresión XPath pueda evaluarse fácilmente en relación con el contexto del nodo donde apareció dentro del documento. Este adaptador funciona como el método DOM Nivel 3`lookupNamespaceURI` en los nodos para resolver el namespaceURI de un prefijo dado usando la información actual disponible en la jerarquía del nodo en el momento en que se llama a lookupNamespaceURI, también resolviendo correctamente el prefijo xml implícito. |
| [CreateProcessingInstruction](../../aspose.svg.dom/document/createprocessinginstruction/)(string, string) | Crea un nodo ProcessingInstruction con el nombre y las cadenas de datos especificados. |
| [CreateTextNode](../../aspose.svg.dom/document/createtextnode/)(string) | Crea un nodo de texto dada la cadena especificada. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker)(Node) | Crear un nuevo TreeWalker sobre el subárbol enraizado en el nodo especificado. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker_1)(Node, long) | Crear un nuevo TreeWalker sobre el subárbol enraizado en el nodo especificado. |
| [CreateTreeWalker](../../aspose.svg.dom/document/createtreewalker/#createtreewalker_2)(Node, long, INodeFilter) | Crear un nuevo TreeWalker sobre el subárbol enraizado en el nodo especificado. |
| [DispatchEvent](../../aspose.svg.dom/eventtarget/dispatchevent/)(Event) | Este método permite el envío de eventos al modelo de eventos de implementaciones. |
| [Dispose](../../aspose.svg.dom/eventtarget/dispose/)() | Realiza tareas definidas por la aplicación asociadas con liberar, liberar o restablecer recursos no administrados. |
| [Evaluate](../../aspose.svg.dom/document/evaluate/)(string, Node, IXPathNSResolver, XPathResultType, object) | Evalúa una cadena de expresión XPath y devuelve un resultado del tipo especificado si es posible. |
| [GetElementById](../../aspose.svg.dom/document/getelementbyid/)(string) | Devuelve el Elemento que tiene un atributo ID con el valor dado. Si no existe tal elemento, esto devuelve nulo. Si más de un elemento tiene un atributo ID con ese valor, lo que se devuelve es indefinido. |
| [GetElementsByClassName](../../aspose.svg.dom/document/getelementsbyclassname/)(string) | Devuelve un objeto NodeList activo que contiene todos los elementos del documento que tienen todas las clases especificadas en el argumento. http://www.w3.org/TR/dom/ |
| [GetElementsByTagName](../../aspose.svg.dom/document/getelementsbytagname/)(string) | Devuelve una lista de nodos de todos los elementos en el orden del documento con un nombre de etiqueta dado y están contenidos en el documento. |
| [GetElementsByTagNameNS](../../aspose.svg.dom/document/getelementsbytagnamens/)(string, string) | Devuelve una lista de nodos de todos los elementos con un nombre local determinado y un URI de espacio de nombres en el orden del documento. |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | Este método se utiliza para recuperar el objeto ECMAScriptType . |
| virtual [HasAttributes](../../aspose.svg.dom/node/hasattributes/)() | Devuelve si este nodo (si es un elemento) tiene algún atributo |
| [HasChildNodes](../../aspose.svg.dom/node/haschildnodes/)() | Devuelve si este nodo tiene hijos. |
| [ImportNode](../../aspose.svg.dom/document/importnode/)(Node, bool) | Importa un nodo de otro documento a este documento, sin alterar ni eliminar el nodo de origen del documento original; este método crea una nueva copia del nodo de origen. |
| [InsertBefore](../../aspose.svg.dom/node/insertbefore/)(Node, Node) | Inserta el nodo antes del nodo secundario existente. Si hijo es nulo, inserte el nodo al final de la lista de hijos. Si hijo es un objeto DocumentFragment, todos sus hijos se insertan, en el mismo orden, antes de hijo. Si el niño ya está en el árbol, primero se elimina. |
| [IsDefaultNamespace](../../aspose.svg.dom/node/isdefaultnamespace/)(string) | Este método comprueba si el namespaceURI especificado es el espacio de nombres predeterminado o no. |
| [IsEqualNode](../../aspose.svg.dom/node/isequalnode/)(Node) | Comprueba si dos nodos son iguales. Este método comprueba la igualdad de los nodos, no la uniformidad (es decir, si los dos nodos son referencias al mismo objeto) que se puede probar con Node.isSameNode(). Todos los nodos que son iguales también serán iguales, aunque lo contrario puede no ser cierto. |
| [IsSameNode](../../aspose.svg.dom/node/issamenode/)(Node) | Devuelve si este nodo es el mismo nodo que el dado. Este método proporciona una forma de determinar si dos referencias de nodo devueltas por la implementación hacen referencia al mismo objeto. Cuando dos referencias de Nodo son referencias al mismo objeto, incluso a través de un proxy, las referencias se pueden usar de manera completamente intercambiable, de modo que todos los atributos tengan los mismos valores y llamar al mismo método DOM en cualquiera de las referencias siempre tiene exactamente el mismo efecto. |
| [LookupNamespaceURI](../../aspose.svg.dom/node/lookupnamespaceuri/)(string) | Busque el URI del espacio de nombres asociado al prefijo dado, a partir de este nodo. |
| [LookupPrefix](../../aspose.svg.dom/node/lookupprefix/)(string) | Busque el prefijo asociado al URI del espacio de nombres dado, a partir de este nodo. Este método ignora las declaraciones de espacios de nombres predeterminados. Consulte Búsqueda de prefijo de espacio de nombres para obtener detalles sobre el algoritmo utilizado por este método. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate)(RequestMessage) | Carga el documento basado en el objeto de solicitud especificado, reemplazando el contenido anterior. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_4)(string) | Carga el documento en el localizador uniforme de recursos (URL) especificado en la instancia actual, reemplazando el contenido anterior. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_1)(Url) | Carga el documento en el localizador uniforme de recursos (URL) especificado en la instancia actual, reemplazando el contenido anterior. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_3)(Stream, string) | Carga el documento desde el contenido especificado y usa baseUri para resolver los recursos relativos, reemplazando el contenido anterior. La carga del documento comienza desde la posición actual en la secuencia. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_2)(Stream, Url) | Carga el documento desde el contenido especificado y usa baseUri para resolver los recursos relativos, reemplazando el contenido anterior. La carga del documento comienza desde la posición actual en la secuencia. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_6)(string, string) | Carga el documento desde el contenido especificado y usa baseUri para resolver los recursos relativos, reemplazando el contenido anterior. |
| [Navigate](../../aspose.svg.dom/document/navigate/#navigate_5)(string, Url) | Carga el documento desde el contenido especificado y usa baseUri para resolver los recursos relativos, reemplazando el contenido anterior. |
| [Normalize](../../aspose.svg.dom/node/normalize/)() | Coloca todos los nodos de texto en toda la profundidad del subárbol debajo de este nodo, incluidos los nodos de atributos, en una forma "normal" donde solo la estructura (p. ej., elementos, comentarios, instrucciones de procesamiento, secciones CDATA y referencias a entidades) separa el texto nodos, es decir, no hay nodos de Texto adyacentes ni nodos de Texto vacíos. Esto se puede usar para garantizar que la vista DOM de un documento sea la misma que si se hubiera guardado y vuelto a cargar, y es útil cuando las operaciones (como las búsquedas de XPointer [XPointer]) que dependen de una estructura de árbol de documento en particular deben realizarse. ser usado. Si el parámetro "normalize-characters" del objeto DOMConfiguration adjunto a Node.ownerDocument es verdadero, este método también normalizará por completo los caracteres de Text nodes. |
| [QuerySelector](../../aspose.svg.dom/document/queryselector/)(string) | Devuelve el primer Elemento del documento, que coincide con selector |
| [QuerySelectorAll](../../aspose.svg.dom/document/queryselectorall/)(string) | Devuelve una lista de nodos de todos los elementos en el documento, que coinciden con selector |
| [RemoveChild](../../aspose.svg.dom/node/removechild/)(Node) | Elimina el nodo hijo indicado por oldChild de la lista de hijos y lo devuelve. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener) | Este método permite eliminar detectores de eventos del destino del evento. Si[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) se elimina de un[`EventTarget`](../eventtarget/) mientras está procesando un evento, no será activado por las acciones actuales. Los detectores de eventos nunca se pueden invocar después de eliminarlos. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, DOMEventHandler, bool) | Este método permite eliminar detectores de eventos del destino del evento. Si[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) se elimina de un[`EventTarget`](../eventtarget/) mientras está procesando un evento, no será activado por las acciones actuales. Los detectores de eventos nunca se pueden invocar después de eliminarlos. |
| [RemoveEventListener](../../aspose.svg.dom/eventtarget/removeeventlistener/)(string, IEventListener, bool) | Este método permite eliminar detectores de eventos del destino del evento. Si[`IEventListener`](../../aspose.svg.dom.events/ieventlistener/) se elimina de un[`EventTarget`](../eventtarget/) mientras está procesando un evento, no será activado por las acciones actuales. Los detectores de eventos nunca se pueden invocar después de eliminarlos. |
| virtual [RenderTo](../../aspose.svg.dom/document/renderto/)(IDevice) | Este método se utiliza para representar el contenido del documento actual en un dispositivo gráfico específico. |
| [ReplaceChild](../../aspose.svg.dom/node/replacechild/)(Node, Node) | Reemplaza el nodo secundario oldChild con newChild en la lista de elementos secundarios y devuelve el nodo oldChild. Si newChild es un objeto DocumentFragment, oldChild se reemplaza por todos los hijos de DocumentFragment, que se insertan en el mismo orden. Si newChild ya está en el árbol, primero se elimina. |
| override [ToString](../../aspose.svg.dom/node/tostring/)() | Devuelve unString que representa esta instancia. |
| [Write](../../aspose.svg.dom/document/write/)(params string[]) | Escribe una cadena de texto en un flujo de documentos abierto por open(). Tenga en cuenta que la función producirá un documento que no está necesariamente controlado por una DTD y, por lo tanto, podría ser producir un resultado no válido en el contexto del documento. |
| [WriteLn](../../aspose.svg.dom/document/writeln/)(params string[]) | Escribe una cadena de texto seguida de un carácter de nueva línea en una secuencia document abierta por open(). Tenga en cuenta que la función producirá un documento que no está necesariamente controlado por una DTD y, por lo tanto, podría producir un resultado no válido en el contexto de documento |

## Eventos

| Nombre | Descripción |
| --- | --- |
| event [OnAbort](../../aspose.svg.dom/document/onabort/) | Obtiene o establece el controlador de eventos para el evento OnAbort. |
| event [OnBlur](../../aspose.svg.dom/document/onblur/) | Obtiene o establece el controlador de eventos para el evento OnBlur. |
| event [OnCancel](../../aspose.svg.dom/document/oncancel/) | Obtiene o establece el controlador de eventos para el evento OnCancel. |
| event [OnCanplay](../../aspose.svg.dom/document/oncanplay/) | Obtiene o establece el controlador de eventos para el evento OnCanplay. |
| event [OnCanPlayThrough](../../aspose.svg.dom/document/oncanplaythrough/) | Obtiene o establece el controlador de eventos para el evento OnCanPlayThrough. |
| event [OnChange](../../aspose.svg.dom/document/onchange/) | Obtiene o establece el controlador de eventos para el evento OnChange. |
| event [OnClick](../../aspose.svg.dom/document/onclick/) | Obtiene o establece el controlador de eventos para el evento OnClick. |
| event [OnCueChange](../../aspose.svg.dom/document/oncuechange/) | Obtiene o establece el controlador de eventos para el evento OnCueChange. |
| event [OnDblClick](../../aspose.svg.dom/document/ondblclick/) | Obtiene o establece el controlador de eventos para el evento OnDblClick. |
| event [OnDurationChange](../../aspose.svg.dom/document/ondurationchange/) | Obtiene o establece el controlador de eventos para el evento OnDurationChange. |
| event [OnEmptied](../../aspose.svg.dom/document/onemptied/) | Obtiene o establece el controlador de eventos para el evento OnEmptied. |
| event [OnEnded](../../aspose.svg.dom/document/onended/) | Obtiene o establece el controlador de eventos para el evento OnEnded. |
| event [OnError](../../aspose.svg.dom/document/onerror/) | Obtiene o establece el controlador de eventos para el evento OnError. |
| event [OnFocus](../../aspose.svg.dom/document/onfocus/) | Obtiene o establece el controlador de eventos para el evento OnFocus. |
| event [OnInput](../../aspose.svg.dom/document/oninput/) | Obtiene o establece el controlador de eventos para el evento OnInput. |
| event [OnInvalid](../../aspose.svg.dom/document/oninvalid/) | Obtiene o establece el controlador de eventos para el evento OnInvalid. |
| event [OnKeyDown](../../aspose.svg.dom/document/onkeydown/) | Obtiene o establece el controlador de eventos para el evento OnKeyDown. |
| event [OnKeyPress](../../aspose.svg.dom/document/onkeypress/) | Obtiene o establece el controlador de eventos para el evento OnKeyPress. |
| event [OnKeyUp](../../aspose.svg.dom/document/onkeyup/) | Obtiene o establece el controlador de eventos para el evento OnKeyUp. |
| event [OnLoad](../../aspose.svg.dom/document/onload/) | Obtiene o establece el controlador de eventos para el evento OnLoad. |
| event [OnLoadedData](../../aspose.svg.dom/document/onloadeddata/) | Obtiene o establece el controlador de eventos para el evento OnLoadedData. |
| event [OnLoadedMetadata](../../aspose.svg.dom/document/onloadedmetadata/) | Obtiene o establece el controlador de eventos para el evento OnLoadedMetadata. |
| event [OnLoadStart](../../aspose.svg.dom/document/onloadstart/) | Obtiene o establece el controlador de eventos para el evento OnLoadStart. |
| event [OnMouseDown](../../aspose.svg.dom/document/onmousedown/) | Obtiene o establece el controlador de eventos para el evento OnMouseDown. |
| event [OnMouseEnter](../../aspose.svg.dom/document/onmouseenter/) | Obtiene o establece el controlador de eventos para el evento OnMouseEnter. |
| event [OnMouseLeave](../../aspose.svg.dom/document/onmouseleave/) | Obtiene o establece el controlador de eventos para el evento OnMouseLeave. |
| event [OnMouseMove](../../aspose.svg.dom/document/onmousemove/) | Obtiene o establece el controlador de eventos para el evento OnMouseMove. |
| event [OnMouseOut](../../aspose.svg.dom/document/onmouseout/) | Obtiene o establece el controlador de eventos para el evento OnMouseOut. |
| event [OnMouseOver](../../aspose.svg.dom/document/onmouseover/) | Obtiene o establece el controlador de eventos para el evento OnMouseOver. |
| event [OnMouseUp](../../aspose.svg.dom/document/onmouseup/) | Obtiene o establece el controlador de eventos para el evento OnMouseUp. |
| event [OnMouseWheel](../../aspose.svg.dom/document/onmousewheel/) | Obtiene o establece el controlador de eventos para el evento OnMouseWheel. |
| event [OnPause](../../aspose.svg.dom/document/onpause/) | Obtiene o establece el controlador de eventos para el evento OnPause. |
| event [OnPlay](../../aspose.svg.dom/document/onplay/) | Obtiene o establece el controlador de eventos para el evento OnPlay. |
| event [OnPlaying](../../aspose.svg.dom/document/onplaying/) | Obtiene o establece el controlador de eventos para el evento OnPlaying. |
| event [OnProgress](../../aspose.svg.dom/document/onprogress/) | Obtiene o establece el controlador de eventos para el evento OnProgress. |
| event [OnRateChange](../../aspose.svg.dom/document/onratechange/) | Obtiene o establece el controlador de eventos para el evento OnRateChange. |
| event [OnReadyStateChange](../../aspose.svg.dom/document/onreadystatechange/) | Obtiene o establece el controlador de eventos para el evento OnReadyStateChange. |
| event [OnReset](../../aspose.svg.dom/document/onreset/) | Obtiene o establece el controlador de eventos para el evento OnReset. |
| event [OnResize](../../aspose.svg.dom/document/onresize/) | Obtiene o establece el controlador de eventos para el evento OnResize. |
| event [OnScroll](../../aspose.svg.dom/document/onscroll/) | Obtiene o establece el controlador de eventos para el evento OnScroll. |
| event [OnSeeked](../../aspose.svg.dom/document/onseeked/) | Obtiene o establece el controlador de eventos para el evento OnSeeked. |
| event [OnSeeking](../../aspose.svg.dom/document/onseeking/) | Obtiene o establece el controlador de eventos para el evento OnSeeking. |
| event [OnSelect](../../aspose.svg.dom/document/onselect/) | Obtiene o establece el controlador de eventos para el evento OnSelect. |
| event [OnShow](../../aspose.svg.dom/document/onshow/) | Obtiene o establece el controlador de eventos para el evento OnShow. |
| event [OnStalled](../../aspose.svg.dom/document/onstalled/) | Obtiene o establece el controlador de eventos para el evento OnStalled. |
| event [OnSubmit](../../aspose.svg.dom/document/onsubmit/) | Obtiene o establece el controlador de eventos para el evento OnSubmit. |
| event [OnSuspend](../../aspose.svg.dom/document/onsuspend/) | Obtiene o establece el controlador de eventos para el evento OnSuspend. |
| event [OnTimeUpdate](../../aspose.svg.dom/document/ontimeupdate/) | Obtiene o establece el controlador de eventos para el evento OnTimeUpdate. |
| event [OnToggle](../../aspose.svg.dom/document/ontoggle/) | Obtiene o establece el controlador de eventos para el evento OnToggle. |
| event [OnVolumeChange](../../aspose.svg.dom/document/onvolumechange/) | Obtiene o establece el controlador de eventos para el evento OnVolumeChange. |
| event [OnWaiting](../../aspose.svg.dom/document/onwaiting/) | Obtiene o establece el controlador de eventos para el evento OnWaiting. |

### Ver también

* class [Node](../node/)
* interface [IDocumentEvent](../../aspose.svg.dom.events/idocumentevent/)
* interface [IDocumentStyle](../../aspose.svg.dom.css/idocumentstyle/)
* interface [IDocumentTraversal](../../aspose.svg.dom.traversal/idocumenttraversal/)
* interface [IGlobalEventHandlers](../iglobaleventhandlers/)
* interface [INonElementParentNode](../inonelementparentnode/)
* interface [IParentNode](../iparentnode/)
* interface [IXPathEvaluator](../../aspose.svg.dom.xpath/ixpathevaluator/)
* espacio de nombres [Aspose.Svg.Dom](../../aspose.svg.dom/)
* asamblea [Aspose.SVG](../../)


