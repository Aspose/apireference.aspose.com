---
title: "System::Xml::XmlWriterSettings classe"
linktitle: "XmlWriterSettings"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlWriterSettings class. Spécifie un ensemble de fonctionnalités à prendre en charge sur l’objet XmlWriter créé par la méthode XmlWriter::Create en C++."
type: docs
weight: 4500
url: /fr/cpp/system.xml/xmlwritersettings/
---
## XmlWriterSettings class


Spécifie un ensemble de fonctionnalités à prendre en charge sur l’objet [XmlWriter](../xmlwriter/) créé par la méthode [XmlWriter::Create](../xmlwriter/create/).

```cpp
class XmlWriterSettings : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() | Crée une copie de l’instance [XmlWriterSettings](./). |
| [get_CheckCharacters](./get_checkcharacters/)() | Renvoie une valeur indiquant si l’écrivain XML doit vérifier que tous les caractères du document sont conformes à la section "2.2 Characters" de la [Recommandation XML 1.0](https://www.w3.org/TR/REC-xml/#charsets) du W3C. |
| [get_CloseOutput](./get_closeoutput/)() | Renvoie une valeur indiquant si le [XmlWriter](../xmlwriter/) doit également fermer le flux sous-jacent ou le TextWriter lorsque la méthode [XmlWriter::Close](../xmlwriter/close/) est appelée. |
| [get_ConformanceLevel](./get_conformancelevel/)() | Renvoie le niveau de conformité que l’écrivain XML vérifie dans la sortie XML. |
| [get_DoNotEscapeUriAttributes](./get_donotescapeuriattributes/)() | Renvoie une valeur indiquant si le [XmlWriter](../xmlwriter/) n’échappe pas les attributs URI. |
| [get_Encoding](./get_encoding/)() | Renvoie le type d’encodage texte à utiliser. |
| [get_Indent](./get_indent/)() | Renvoie une valeur indiquant s’il faut indenter les éléments. |
| [get_IndentChars](./get_indentchars/)() | Renvoie la chaîne de caractères à utiliser lors de l’indentation. Ce paramètre est utilisé lorsque la valeur [XmlWriterSettings::set_Indent](./set_indent/) est définie sur **true**. |
| [get_NamespaceHandling](./get_namespacehandling/)() | Renvoie une valeur indiquant si le [XmlWriter](../xmlwriter/) doit supprimer les déclarations d’espace de noms en double lors de l’écriture du contenu XML. Le comportement par défaut est que l’écrivain émet toutes les déclarations d’espace de noms présentes dans le résolveur d’espaces de noms de l’écrivain. |
| [get_NewLineChars](./get_newlinechars/)() | Renvoie la chaîne de caractères à utiliser pour les sauts de ligne. |
| [get_NewLineHandling](./get_newlinehandling/)() | Renvoie une valeur indiquant s’il faut normaliser les sauts de ligne dans la sortie. |
| [get_NewLineOnAttributes](./get_newlineonattributes/)() | Renvoie une valeur indiquant s'il faut écrire les attributs sur une nouvelle ligne. |
| [get_OmitXmlDeclaration](./get_omitxmldeclaration/)() | Renvoie une valeur indiquant s'il faut omettre une déclaration XML. |
| [get_OutputMethod](./get_outputmethod/)() | Renvoie la méthode utilisée pour sérialiser la sortie du [XmlWriter](../xmlwriter/). |
| [get_WriteEndDocumentOnClose](./get_writeenddocumentonclose/)() | Renvoie une valeur qui indique si le [XmlWriter](../xmlwriter/) ajoutera des balises de fermeture à toutes les balises d'élément non fermées lorsque la méthode [XmlWriter::Close](../xmlwriter/close/) est appelée. |
| [Reset](./reset/)() | Réinitialise les membres de la classe de paramètres à leurs valeurs par défaut. |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | Définit une valeur qui indique si l'écrivain XML doit vérifier que tous les caractères du document sont conformes à la section "2.2 Characters" de la [Recommandation XML 1.0](https://www.w3.org/TR/REC-xml/#charsets) du W3C. |
| [set_CloseOutput](./set_closeoutput/)(bool) | Définit une valeur indiquant si le [XmlWriter](../xmlwriter/) doit également fermer le flux sous-jacent ou le TextWriter lorsque la méthode [XmlWriter::Close](../xmlwriter/close/) est appelée. |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | Définit le niveau de conformité que l'écrivain XML vérifie dans la sortie XML. |
| [set_DoNotEscapeUriAttributes](./set_donotescapeuriattributes/)(bool) | Définit une valeur qui indique si le [XmlWriter](../xmlwriter/) n'échappe pas les attributs URI. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | Définit le type d'encodage texte à utiliser. |
| [set_Indent](./set_indent/)(bool) | Définit une valeur indiquant s'il faut indenter les éléments. |
| [set_IndentChars](./set_indentchars/)(const String\&) | Définit la chaîne de caractères à utiliser lors de l'indentation. Ce paramètre est utilisé lorsque la valeur [XmlWriterSettings::set_Indent](./set_indent/) est définie sur **true**. |
| [set_NamespaceHandling](./set_namespacehandling/)(System::Xml::NamespaceHandling) | Définit une valeur qui indique si le [XmlWriter](../xmlwriter/) doit supprimer les déclarations d'espaces de noms en double lors de l'écriture du contenu XML. Le comportement par défaut est que l'écrivain génère toutes les déclarations d'espaces de noms présentes dans le résolveur d'espaces de noms de l'écrivain. |
| [set_NewLineChars](./set_newlinechars/)(const String\&) | Définit la chaîne de caractères à utiliser pour les sauts de ligne. |
| [set_NewLineHandling](./set_newlinehandling/)(System::Xml::NewLineHandling) | Définit une valeur indiquant s'il faut normaliser les sauts de ligne dans la sortie. |
| [set_NewLineOnAttributes](./set_newlineonattributes/)(bool) | Définit une valeur indiquant s'il faut écrire les attributs sur une nouvelle ligne. |
| [set_OmitXmlDeclaration](./set_omitxmldeclaration/)(bool) | Définit une valeur indiquant s'il faut omettre une déclaration XML. |
| [set_WriteEndDocumentOnClose](./set_writeenddocumentonclose/)(bool) | Définit une valeur qui indique si le [XmlWriter](../xmlwriter/) ajoutera des balises de fermeture à toutes les balises d'élément non fermées lorsque la méthode [XmlWriter::Close](../xmlwriter/close/) est appelée. |
| [XmlWriterSettings](./xmlwritersettings/)() | Initialise une nouvelle instance de la classe [XmlWriterSettings](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
