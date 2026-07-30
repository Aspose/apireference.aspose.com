---
title: "Méthode System::Xml::Xsl::XslTransform::Transform"
linktitle: "Transformation"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::Xsl::XslTransform::Transform. Transforme les données XML dans l'IXPathNavigable en utilisant les args spécifiés et renvoie le résultat vers un XmlReader en C++."
type: docs
weight: 400
url: /fr/cpp/system.xml.xsl/xsltransform/transform/
---
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) method


Transforme les données XML dans l'IXPathNavigable en utilisant les **args** spécifiés et renvoie le résultat vers un [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un objet implémentant l'interface IXPathNavigable. Il peut s'agir soit d'un [XmlNode](../../../system.xml/xmlnode/) (généralement un [XmlDocument](../../../system.xml/xmldocument/)), soit d'un XPathDocument contenant les données à transformer. |
| args | const SharedPtr\<XsltArgumentList\>\& | Une [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée pour la transformation. |

### ReturnValue

Un [XmlReader](../../../system.xml/xmlreader/) contenant les résultats de la transformation.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Transforme les données XML dans le IXPathNavigable en utilisant les **args** spécifiés et écrit le résultat dans un flux.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un objet implémentant l'interface IXPathNavigable. Il peut s'agir soit d'un [XmlNode](../../../system.xml/xmlnode/) (généralement un [XmlDocument](../../../system.xml/xmldocument/)), soit d'un XPathDocument contenant les données à transformer. |
| args | const SharedPtr\<XsltArgumentList\>\& | Une [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée pour la transformation. |
| sortie | const SharedPtr\<IO::Stream\>\& | Le flux vers lequel vous souhaitez écrire. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transforme les données XML dans le IXPathNavigable en utilisant les **args** spécifiés et écrit le résultat dans un flux.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un objet implémentant l'interface IXPathNavigable. Il peut s'agir soit d'un [XmlNode](../../../system.xml/xmlnode/) (généralement un [XmlDocument](../../../system.xml/xmldocument/)), soit d'un XPathDocument contenant les données à transformer. |
| args | const SharedPtr\<XsltArgumentList\>\& | Une [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée pour la transformation. |
| sortie | const SharedPtr\<IO::Stream\>\& | Le flux vers lequel vous souhaitez écrire. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour résoudre la fonction XSLT **document()**. Si cette valeur est **nullptr**, la fonction **document()** n'est pas résolue. Le [XmlResolver](../../../system.xml/xmlresolver/) n'est pas mis en cache après l'exécution de la méthode [XslTransform::Transform](./). |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Transforme les données XML dans le IXPathNavigable en utilisant les **args** spécifiés et écrit le résultat dans un TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un objet implémentant l'interface IXPathNavigable. Il peut s'agir soit d'un [XmlNode](../../../system.xml/xmlnode/) (généralement un [XmlDocument](../../../system.xml/xmldocument/)), soit d'un XPathDocument contenant les données à transformer. |
| args | const SharedPtr\<XsltArgumentList\>\& | Une [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée pour la transformation. |
| sortie | const SharedPtr\<IO::TextWriter\>\& | Le TextWriter vers lequel vous souhaitez écrire. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transforme les données XML dans le IXPathNavigable en utilisant les **args** spécifiés et écrit le résultat dans un TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un objet implémentant l'interface IXPathNavigable. Il peut s'agir soit d'un [XmlNode](../../../system.xml/xmlnode/) (généralement un [XmlDocument](../../../system.xml/xmldocument/)), soit d'un XPathDocument contenant les données à transformer. |
| args | const SharedPtr\<XsltArgumentList\>\& | Une [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée pour la transformation. |
| sortie | const SharedPtr\<IO::TextWriter\>\& | Le TextWriter vers lequel vous souhaitez écrire. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour résoudre la fonction XSLT **document()**. Si cette valeur est **nullptr**, la fonction **document()** n'est pas résolue. Le [XmlResolver](../../../system.xml/xmlresolver/) n'est pas mis en cache après l'exécution de cette méthode. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transforme les données XML dans l'IXPathNavigable en utilisant les **args** spécifiés et renvoie le résultat vers un [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un objet implémentant l'interface IXPathNavigable. Il peut s'agir soit d'un [XmlNode](../../../system.xml/xmlnode/) (généralement un [XmlDocument](../../../system.xml/xmldocument/)), soit d'un XPathDocument contenant les données à transformer. |
| args | const SharedPtr\<XsltArgumentList\>\& | Une [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée pour la transformation. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour résoudre la fonction XSLT **document()**. Si cette valeur est **nullptr**, la fonction **document()** n'est pas résolue. Le [XmlResolver](../../../system.xml/xmlresolver/) n'est pas mis en cache après l'exécution de cette méthode. |

### ReturnValue

Un [XmlReader](../../../system.xml/xmlreader/) contenant les résultats de la transformation.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Transforme les données XML dans l'IXPathNavigable en utilisant les **args** spécifiés et renvoie le résultat vers un [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un objet implémentant l'interface IXPathNavigable. Il peut s'agir soit d'un [XmlNode](../../../system.xml/xmlnode/) (généralement un [XmlDocument](../../../system.xml/xmldocument/)), soit d'un XPathDocument contenant les données à transformer. |
| args | const SharedPtr\<XsltArgumentList\>\& | Une [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée pour la transformation. |
| output | const SharedPtr\<XmlWriter\>\& | Le [XmlWriter](../../../system.xml/xmlwriter/) vers lequel vous souhaitez écrire. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transforme les données XML dans l'IXPathNavigable en utilisant les **args** spécifiés et renvoie le résultat vers un [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un objet implémentant l'interface IXPathNavigable. Il peut s'agir soit d'un [XmlNode](../../../system.xml/xmlnode/) (généralement un [XmlDocument](../../../system.xml/xmldocument/)), soit d'un XPathDocument contenant les données à transformer. |
| args | const SharedPtr\<XsltArgumentList\>\& | Une [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée pour la transformation. |
| output | const SharedPtr\<XmlWriter\>\& | Le [XmlWriter](../../../system.xml/xmlwriter/) vers lequel vous souhaitez écrire. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour résoudre la fonction XSLT **document()**. Si cette valeur est **nullptr**, la fonction **document()** n'est pas résolue. Le [XmlResolver](../../../system.xml/xmlresolver/) n'est pas mis en cache après l'exécution de cette méthode. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) method


Transforme les données XML du XPathNavigator en utilisant les **args** spécifiés et renvoie le résultat vers un [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un XPathNavigator contenant les données à transformer. |
| args | const SharedPtr\<XsltArgumentList\>\& | Une [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée pour la transformation. |

### ReturnValue

Un [XmlReader](../../../system.xml/xmlreader/) contenant les résultats de la transformation.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Transforme les données XML dans le XPathNavigator en utilisant les **args** spécifiés et écrit le résultat dans un flux.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un XPathNavigator contenant les données à transformer. |
| args | const SharedPtr\<XsltArgumentList\>\& | Une [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée pour la transformation. |
| sortie | const SharedPtr\<IO::Stream\>\& | Le flux vers lequel vous souhaitez écrire. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transforme les données XML dans le XPathNavigator en utilisant les **args** spécifiés et écrit le résultat dans un flux.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::Stream> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un XPathNavigator contenant les données à transformer. |
| args | const SharedPtr\<XsltArgumentList\>\& | Une [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée pour la transformation. |
| sortie | const SharedPtr\<IO::Stream\>\& | Le flux vers lequel vous souhaitez écrire. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour résoudre la fonction XSLT **document()**. Si cette valeur est **nullptr**, la fonction **document()** n'est pas résolue. Le [XmlResolver](../../../system.xml/xmlresolver/) n'est pas mis en cache après l'exécution de cette méthode. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Transforme les données XML dans le XPathNavigator en utilisant les **args** spécifiés et écrit le résultat dans un TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un XPathNavigator contenant les données à transformer. |
| args | const SharedPtr\<XsltArgumentList\>\& | Une [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée pour la transformation. |
| sortie | const SharedPtr\<IO::TextWriter\>\& | Le TextWriter vers lequel vous souhaitez écrire. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transforme les données XML dans le XPathNavigator en utilisant les **args** spécifiés et écrit le résultat dans un TextWriter.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<IO::TextWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un XPathNavigator contenant les données à transformer. |
| args | const SharedPtr\<XsltArgumentList\>\& | Une [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée pour la transformation. |
| sortie | const SharedPtr\<IO::TextWriter\>\& | Le TextWriter vers lequel vous souhaitez écrire. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour résoudre la fonction XSLT **document()**. Si cette valeur est **nullptr**, la fonction **document()** n'est pas résolue. Le [XmlResolver](../../../system.xml/xmlresolver/) n'est pas mis en cache après l'exécution de cette méthode. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transforme les données XML du XPathNavigator en utilisant les **args** spécifiés et renvoie le résultat vers un [XmlReader](../../../system.xml/xmlreader/).

```cpp
SharedPtr<XmlReader> System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un XPathNavigator contenant les données à transformer. |
| args | const SharedPtr\<XsltArgumentList\>\& | Une [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée pour la transformation. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour résoudre la fonction XSLT **document()**. Si cette valeur est **nullptr**, la fonction **document()** n'est pas résolue. Le [XmlResolver](../../../system.xml/xmlresolver/) n'est pas mis en cache après l'exécution de cette méthode. |

### ReturnValue

Un [XmlReader](../../../system.xml/xmlreader/) contenant les résultats de la transformation.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Transforme les données XML du XPathNavigator en utilisant les args spécifiés et renvoie le résultat vers un [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un XPathNavigator contenant les données à transformer. |
| args | const SharedPtr\<XsltArgumentList\>\& | Une [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée pour la transformation. |
| output | const SharedPtr\<XmlWriter\>\& | Le [XmlWriter](../../../system.xml/xmlwriter/) vers lequel vous souhaitez écrire. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transforme les données XML du XPathNavigator en utilisant les args spécifiés et renvoie le résultat vers un [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslTransform::Transform(const SharedPtr<System::Xml::XPath::XPathNavigator> &input, const SharedPtr<XsltArgumentList> &args, const SharedPtr<XmlWriter> &output, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::XPathNavigator\>\& | Un XPathNavigator contenant les données à transformer. |
| args | const SharedPtr\<XsltArgumentList\>\& | Une [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée pour la transformation. |
| output | const SharedPtr\<XmlWriter\>\& | Le [XmlWriter](../../../system.xml/xmlwriter/) vers lequel vous souhaitez écrire. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour résoudre la fonction XSLT **document()**. Si cette valeur est **nullptr**, la fonction **document()** n'est pas résolue. Le [XmlResolver](../../../system.xml/xmlresolver/) n'est pas mis en cache après l'exécution de cette méthode. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const String\&, const String\&) method


Transforme les données XML dans le fichier d'entrée et écrit le résultat dans un fichier de sortie.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| inputfile | const String\& | L'URL du document source à transformer. |
| outputfile | const String\& | L'URL du fichier de sortie. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslTransform::Transform(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) method


Transforme les données XML dans le fichier d'entrée et écrit le résultat dans un fichier de sortie.

```cpp
void System::Xml::Xsl::XslTransform::Transform(const String &inputfile, const String &outputfile, const SharedPtr<System::Xml::XmlResolver> &resolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| inputfile | const String\& | L'URL du document source à transformer. |
| outputfile | const String\& | L'URL du fichier de sortie. |
| resolver | const SharedPtr\<System::Xml::XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour résoudre la fonction XSLT **document()**. Si cette valeur est **nullptr**, la fonction **document()** n'est pas résolue. Le [XmlResolver](../../../system.xml/xmlresolver/) n'est pas mis en cache après l'exécution de la méthode [XslTransform::Transform](./). |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
