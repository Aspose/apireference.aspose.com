---
title: "System::Xml::Xsl::XslCompiledTransform::Transform méthode"
linktitle: "Transformation"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Xsl::XslCompiledTransform::Transform méthode. Exécute la transformation en utilisant le document d'entrée spécifié par l'objet IXPathNavigable et écrit les résultats dans un XmlWriter en C++."
type: docs
weight: 400
url: /fr/cpp/system.xml.xsl/xslcompiledtransform/transform/
---
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) method


Exécute la transformation en utilisant le document d'entrée spécifié par l'objet IXPathNavigable et écrit les résultats dans un [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XmlWriter> &results)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un objet implémentant l'interface IXPathNavigable. Il peut s'agir soit d'un [XmlNode](../../../system.xml/xmlnode/) (généralement un [XmlDocument](../../../system.xml/xmldocument/)), soit d'un XPathDocument contenant les données à transformer. |
| results | const SharedPtr\<XmlWriter\>\& | Le [XmlWriter](../../../system.xml/xmlwriter/) vers lequel vous souhaitez écrire. Si la feuille de style contient un élément **xsl:output**, vous devez créer le [XmlWriter](../../../system.xml/xmlwriter/) en utilisant l'objet [XmlWriterSettings](../../../system.xml/xmlwritersettings/) retourné par la valeur [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Cela garantit que le [XmlWriter](../../../system.xml/xmlwriter/) possède les paramètres de sortie corrects. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Exécute la transformation en utilisant le document d'entrée spécifié par l'objet IXPathNavigable et écrit les résultats dans un flux. Le [XsltArgumentList](../../xsltargumentlist/) fournit des arguments d'exécution supplémentaires.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un objet implémentant l'interface IXPathNavigable. Il peut s'agir soit d'un [XmlNode](../../../system.xml/xmlnode/) (généralement un [XmlDocument](../../../system.xml/xmldocument/)), soit d'un XPathDocument contenant les données à transformer. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée de la transformation. Cette valeur peut être **nullptr**. |
| résultats | const SharedPtr\<IO::Stream\>\& | Le flux vers lequel vous souhaitez écrire. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Exécute la transformation en utilisant le document d'entrée spécifié par l'objet IXPathNavigable et écrit les résultats dans un TextWriter. Le [XsltArgumentList](../../xsltargumentlist/) fournit des arguments d'exécution supplémentaires.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un objet implémentant l'interface IXPathNavigable. Il peut s'agir soit d'un [XmlNode](../../../system.xml/xmlnode/) (généralement un [XmlDocument](../../../system.xml/xmldocument/)), soit d'un XPathDocument contenant les données à transformer. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée de la transformation. Cette valeur peut être **nullptr**. |
| résultats | const SharedPtr\<IO::TextWriter\>\& | Le TextWriter vers lequel vous souhaitez écrire. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Exécute la transformation en utilisant le document d'entrée spécifié par l'objet IXPathNavigable et écrit les résultats dans un [XmlWriter](../../../system.xml/xmlwriter/). Le [XsltArgumentList](../../xsltargumentlist/) fournit des arguments d'exécution supplémentaires.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Un objet implémentant l'interface IXPathNavigable. Il peut s'agir soit d'un [XmlNode](../../../system.xml/xmlnode/) (généralement un [XmlDocument](../../../system.xml/xmldocument/)), soit d'un XPathDocument contenant les données à transformer. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée de la transformation. Cette valeur peut être **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | Le [XmlWriter](../../../system.xml/xmlwriter/) vers lequel vous souhaitez écrire. Si la feuille de style contient un élément **xsl:output**, vous devez créer le [XmlWriter](../../../system.xml/xmlwriter/) en utilisant l'objet [XmlWriterSettings](../../../system.xml/xmlwritersettings/) retourné par la valeur [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Cela garantit que le [XmlWriter](../../../system.xml/xmlwriter/) possède les paramètres de sortie corrects. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


Exécute la transformation en utilisant le document d'entrée spécifié par l'objet IXPathNavigable et écrit les résultats dans un [XmlWriter](../../../system.xml/xmlwriter/). Le [XsltArgumentList](../../xsltargumentlist/) fournit des arguments d'exécution supplémentaires et le [XmlResolver](../../../system.xml/xmlresolver/) résout la fonction XSLT **document()**.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<System::Xml::XPath::IXPathNavigable> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\& | Le document à transformer qui est spécifié par l'objet IXPathNavigable. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Liste d'arguments sous forme de [XsltArgumentList](../../xsltargumentlist/). |
| results | const SharedPtr\<XmlWriter\>\& | Le [XmlWriter](../../../system.xml/xmlwriter/) vers lequel vous souhaitez écrire. Si la feuille de style contient un élément **xsl:output**, vous devez créer le [XmlWriter](../../../system.xml/xmlwriter/) en utilisant l'objet [XmlWriterSettings](../../../system.xml/xmlwritersettings/) retourné par la valeur [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Cela garantit que le [XmlWriter](../../../system.xml/xmlwriter/) possède les paramètres de sortie corrects. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour résoudre la fonction XSLT **document()**. Si celui-ci est **nullptr**, la fonction **document()** n'est pas résolue. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXPathNavigable](../../../system.xml.xpath/ixpathnavigable/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) method


Exécute la transformation en utilisant le document d'entrée spécifié par l'objet [XmlReader](../../../system.xml/xmlreader/) et écrit les résultats dans un [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XmlWriter> &results)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Le [XmlReader](../../../system.xml/xmlreader/) contenant le document d'entrée. |
| results | const SharedPtr\<XmlWriter\>\& | Le [XmlWriter](../../../system.xml/xmlwriter/) vers lequel vous souhaitez écrire. Si la feuille de style contient un élément **xsl:output**, vous devez créer le [XmlWriter](../../../system.xml/xmlwriter/) en utilisant l'objet [XmlWriterSettings](../../../system.xml/xmlwritersettings/) retourné par la valeur [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Cela garantit que le [XmlWriter](../../../system.xml/xmlwriter/) possède les paramètres de sortie corrects. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Exécute la transformation en utilisant le document d'entrée spécifié par l'objet [XmlReader](../../../system.xml/xmlreader/) et écrit les résultats dans un flux. Le [XsltArgumentList](../../xsltargumentlist/) fournit des arguments d'exécution supplémentaires.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Un [XmlReader](../../../system.xml/xmlreader/) contenant le document d'entrée. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée de la transformation. Cette valeur peut être **nullptr**. |
| résultats | const SharedPtr\<IO::Stream\>\& | Le flux vers lequel vous souhaitez écrire. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Exécute la transformation en utilisant le document d'entrée spécifié par l'objet [XmlReader](../../../system.xml/xmlreader/) et écrit les résultats dans un TextWriter. Le [XsltArgumentList](../../xsltargumentlist/) fournit des arguments d'exécution supplémentaires.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Un [XmlReader](../../../system.xml/xmlreader/) contenant le document d'entrée. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée de la transformation. Cette valeur peut être **nullptr**. |
| résultats | const SharedPtr\<IO::TextWriter\>\& | Le TextWriter vers lequel vous souhaitez écrire. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Exécute la transformation en utilisant le document d'entrée spécifié par l'objet [XmlReader](../../../system.xml/xmlreader/) et écrit les résultats dans un [XmlWriter](../../../system.xml/xmlwriter/). Le [XsltArgumentList](../../xsltargumentlist/) fournit des arguments d'exécution supplémentaires.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Un [XmlReader](../../../system.xml/xmlreader/) contenant le document d'entrée. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée de la transformation. Cette valeur peut être **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | Le [XmlWriter](../../../system.xml/xmlwriter/) vers lequel vous souhaitez écrire. Si la feuille de style contient un élément **xsl:output**, vous devez créer le [XmlWriter](../../../system.xml/xmlwriter/) en utilisant l'objet [XmlWriterSettings](../../../system.xml/xmlwritersettings/) retourné par la valeur [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Cela garantit que le [XmlWriter](../../../system.xml/xmlwriter/) possède les paramètres de sortie corrects. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) method


Exécute la transformation en utilisant le document d'entrée spécifié par l'objet [XmlReader](../../../system.xml/xmlreader/) et écrit les résultats dans un [XmlWriter](../../../system.xml/xmlwriter/). Le [XsltArgumentList](../../xsltargumentlist/) fournit des arguments d'exécution supplémentaires et le [XmlResolver](../../../system.xml/xmlresolver/) résout la fonction XSLT **document()**.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const SharedPtr<XmlReader> &input, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results, const SharedPtr<XmlResolver> &documentResolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | const SharedPtr\<XmlReader\>\& | Un [XmlReader](../../../system.xml/xmlreader/) contenant le document d'entrée. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée de la transformation. Cette valeur peut être **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | Le [XmlWriter](../../../system.xml/xmlwriter/) vers lequel vous souhaitez écrire. Si la feuille de style contient un élément **xsl:output**, vous devez créer le [XmlWriter](../../../system.xml/xmlwriter/) en utilisant l'objet [XmlWriterSettings](../../../system.xml/xmlwritersettings/) retourné par la valeur [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Cela garantit que le [XmlWriter](../../../system.xml/xmlwriter/) possède les paramètres de sortie corrects. |
| documentResolver | const SharedPtr\<XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour résoudre la fonction XSLT **document()**. Si celui-ci est **nullptr**, la fonction **document()** n'est pas résolue. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XmlWriter\>\&) method


Exécute la transformation en utilisant le document d'entrée spécifié par l'URI et écrit les résultats dans un [XmlWriter](../../../system.xml/xmlwriter/).

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XmlWriter> &results)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| inputUri | const String\& | L'URI du document d'entrée. |
| results | const SharedPtr\<XmlWriter\>\& | Le [XmlWriter](../../../system.xml/xmlwriter/) vers lequel vous souhaitez écrire. Si la feuille de style contient un élément **xsl:output**, vous devez créer le [XmlWriter](../../../system.xml/xmlwriter/) en utilisant l'objet [XmlWriterSettings](../../../system.xml/xmlwritersettings/) retourné par la valeur [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Cela garantit que le [XmlWriter](../../../system.xml/xmlwriter/) possède les paramètres de sortie corrects. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) method


Exécute la transformation en utilisant le document d'entrée spécifié par l'URI et écrit les résultats dans le flux. Le [XsltArgumentList](../../xsltargumentlist/) fournit des arguments d'exécution supplémentaires.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::Stream> &results)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| inputUri | const String\& | L'URI du document d'entrée. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée de la transformation. Cette valeur peut être **nullptr**. |
| résultats | const SharedPtr\<IO::Stream\>\& | Le flux vers lequel vous souhaitez écrire. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [Stream](../../../system.io/stream/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) method


Exécute la transformation en utilisant le document d'entrée spécifié par l'URI et écrit les résultats dans un TextWriter.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<IO::TextWriter> &results)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| inputUri | const String\& | L'URI du document d'entrée. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée de la transformation. Cette valeur peut être **nullptr**. |
| résultats | const SharedPtr\<IO::TextWriter\>\& | Le TextWriter vers lequel vous souhaitez écrire. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [TextWriter](../../../system.io/textwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) method


Exécute la transformation en utilisant le document d'entrée spécifié par l'URI et écrit les résultats dans un [XmlWriter](../../../system.xml/xmlwriter/). Le [XsltArgumentList](../../xsltargumentlist/) fournit des arguments d'exécution supplémentaires.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const SharedPtr<XsltArgumentList> &arguments, const SharedPtr<XmlWriter> &results)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| inputUri | const String\& | L'URI du document d'entrée. |
| arguments | const SharedPtr\<XsltArgumentList\>\& | Un [XsltArgumentList](../../xsltargumentlist/) contenant les arguments qualifiés par l'espace de noms utilisés comme entrée de la transformation. Cette valeur peut être **nullptr**. |
| results | const SharedPtr\<XmlWriter\>\& | Le [XmlWriter](../../../system.xml/xmlwriter/) vers lequel vous souhaitez écrire. Si la feuille de style contient un élément **xsl:output**, vous devez créer le [XmlWriter](../../../system.xml/xmlwriter/) en utilisant l'objet [XmlWriterSettings](../../../system.xml/xmlwritersettings/) retourné par la valeur [XslCompiledTransform::get_OutputSettings](../get_outputsettings/). Cela garantit que le [XmlWriter](../../../system.xml/xmlwriter/) possède les paramètres de sortie corrects. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XsltArgumentList](../../xsltargumentlist/)
* Class [XmlWriter](../../../system.xml/xmlwriter/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
## XslCompiledTransform::Transform(const String\&, const String\&) method


Exécute la transformation en utilisant le document d'entrée spécifié par l'URI et écrit les résultats dans un fichier.

```cpp
void System::Xml::Xsl::XslCompiledTransform::Transform(const String &inputUri, const String &resultsFile)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| inputUri | const String\& | L'URI du document d'entrée. |
| resultsFile | const String\& | L'URI du fichier de sortie. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [XslCompiledTransform](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Font for C++](../../../)
