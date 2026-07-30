---
title: "Classe System::Xml::XmlWriter"
linktitle: "XmlWriter"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlWriter. Représente un écrivain qui fournit une méthode rapide, non mise en cache et en lecture seule pour générer des flux ou des fichiers contenant des données XML en C++."
type: docs
weight: 4400
url: /fr/cpp/system.xml/xmlwriter/
---
## XmlWriter class


Représente un écrivain qui fournit une méthode rapide, non mise en cache et en lecture seule avant pour générer des flux ou des fichiers contenant des données XML.

```cpp
class XmlWriter : public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Close](./close/)() | Lorsqu'il est remplacé dans une classe dérivée, ferme ce flux ainsi que le flux sous-jacent. |
| static [Create](./create/)(const String\&) | Crée une nouvelle instance de [XmlWriter](./) en utilisant le nom de fichier spécifié. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlWriterSettings\>) | Crée une nouvelle instance de [XmlWriter](./) en utilisant le nom de fichier et l'objet [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | Crée une nouvelle instance de [XmlWriter](./) en utilisant le flux spécifié. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlWriterSettings\>) | Crée une nouvelle instance de [XmlWriter](./) en utilisant le flux et l'objet [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&) | Crée une nouvelle instance de [XmlWriter](./) en utilisant le TextWriter spécifié. |
| static [Create](./create/)(const SharedPtr\<IO::TextWriter\>\&, SharedPtr\<XmlWriterSettings\>) | Crée une nouvelle instance de [XmlWriter](./) en utilisant le TextWriter et les objets [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&) | Crée une nouvelle instance de [XmlWriter](./) en utilisant le [Text::StringBuilder](../../system.text/stringbuilder/) spécifié. |
| static [Create](./create/)(const SharedPtr\<Text::StringBuilder\>\&, SharedPtr\<XmlWriterSettings\>) | Crée une nouvelle instance de [XmlWriter](./) en utilisant le [Text::StringBuilder](../../system.text/stringbuilder/) et les objets [XmlWriterSettings](../xmlwritersettings/). |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&) | Crée une nouvelle instance de [XmlWriter](./) en utilisant l'objet [XmlWriter](./) spécifié. |
| static [Create](./create/)(const SharedPtr\<XmlWriter\>\&, SharedPtr\<XmlWriterSettings\>) | Crée une nouvelle instance de [XmlWriter](./) en utilisant les objets [XmlWriter](./) et [XmlWriterSettings](../xmlwritersettings/) spécifiés. |
| [Dispose](./dispose/)() override | Libère toutes les ressources utilisées par l'instance actuelle de la classe [XmlWriter](./). |
| virtual [Flush](./flush/)() | Lorsqu'il est remplacé dans une classe dérivée, vide tout ce qui se trouve dans le tampon vers les flux sous-jacents et vide également le flux sous-jacent. |
| virtual [get_Settings](./get_settings/)() | Renvoie l'objet [XmlWriterSettings](../xmlwritersettings/) utilisé pour créer cette instance de [XmlWriter](./). |
| virtual [get_WriteState](./get_writestate/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient l'état de l'écrivain. |
| virtual [get_XmlLang](./get_xmllang/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient la portée actuelle **xml:lang**. |
| virtual [get_XmlSpace](./get_xmlspace/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient un [XmlSpace](../xmlspace/) représentant la portée actuelle de **xml:space**. |
| virtual [LookupPrefix](./lookupprefix/)(String) | Lorsqu'il est remplacé dans une classe dérivée, renvoie le préfixe le plus proche défini dans la portée de l'espace de noms actuel pour l'URI de l'espace de noms. |
| virtual [WriteAttributes](./writeattributes/)(SharedPtr\<XmlReader\>, bool) | Lorsqu'il est remplacé dans une classe dérivée, écrit tous les attributs trouvés à la position actuelle dans le [XmlReader](../xmlreader/). |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&) | Lorsqu'il est remplacé dans une classe dérivée, écrit un attribut avec le nom local, l'URI de l'espace de noms et la valeur spécifiés. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&) | Lorsqu'il est remplacé dans une classe dérivée, écrit l'attribut avec le nom local et la valeur spécifiés. |
| [WriteAttributeString](./writeattributestring/)(const String\&, const String\&, const String\&, const String\&) | Lorsqu'il est remplacé dans une classe dérivée, écrit l'attribut avec le préfixe, le nom local, l'URI de l'espace de noms et la valeur spécifiés. |
| virtual [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Lorsqu'il est remplacé dans une classe dérivée, encode les octets binaires spécifiés en Base64 et écrit le texte résultant. |
| virtual [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | Lorsqu'il est remplacé dans une classe dérivée, encode les octets binaires spécifiés en **BinHex** et écrit le texte résultant. |
| virtual [WriteCData](./writecdata/)(String) | Lorsqu'il est remplacé dans une classe dérivée, écrit un bloc **...** contenant le texte spécifié. |
| virtual [WriteCharEntity](./writecharentity/)(char16_t) | Lorsqu'il est remplacé dans une classe dérivée, force la génération d'une entité de caractère pour la valeur Unicode spécifiée. |
| virtual [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Lorsqu'il est remplacé dans une classe dérivée, écrit le texte un tampon à la fois. |
| virtual [WriteComment](./writecomment/)(String) | Lorsqu'il est remplacé dans une classe dérivée, écrit un commentaire **** contenant le texte spécifié. |
| virtual [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) | Lorsqu'il est remplacé dans une classe dérivée, écrit la déclaration DOCTYPE avec le nom spécifié et les attributs optionnels. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&) | Écrit un élément avec le nom local et la valeur spécifiés. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&) | Écrit un élément avec le nom local, l'URI de l'espace de noms et la valeur spécifiés. |
| [WriteElementString](./writeelementstring/)(const String\&, const String\&, const String\&, const String\&) | Écrit un élément avec le préfixe, le nom local, l'URI de l'espace de noms et la valeur spécifiés. |
| virtual [WriteEndAttribute](./writeendattribute/)() | Lorsqu'il est remplacé dans une classe dérivée, ferme l'appel précédent XmlWriter::WriteStartAttribute(String,String). |
| virtual [WriteEndDocument](./writeenddocument/)() | Lorsqu'il est remplacé dans une classe dérivée, ferme tous les éléments ou attributs ouverts et remet l'écrivain dans l'état Start. |
| virtual [WriteEndElement](./writeendelement/)() | Lorsqu'il est remplacé dans une classe dérivée, ferme un élément et dépile la portée de l'espace de noms correspondante. |
| virtual [WriteEntityRef](./writeentityref/)(const String\&) | Lorsqu'il est remplacé dans une classe dérivée, écrit une référence d'entité sous la forme **&name**;. |
| virtual [WriteFullEndElement](./writefullendelement/)() | Lorsqu'il est remplacé dans une classe dérivée, ferme un élément et dépile la portée de l'espace de noms correspondante. |
| virtual [WriteName](./writename/)(const String\&) | Lorsqu'il est remplacé dans une classe dérivée, écrit le nom spécifié, en s'assurant qu'il s'agit d'un nom valide selon la recommandation W3C XML 1.0 ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNmToken](./writenmtoken/)(const String\&) | Lorsqu'il est remplacé dans une classe dérivée, écrit le nom spécifié, en s'assurant qu'il s'agit d'un NmToken valide selon la recommandation W3C XML 1.0 ([https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name)). |
| virtual [WriteNode](./writenode/)(SharedPtr\<XmlReader\>, bool) | Lorsqu'il est remplacé dans une classe dérivée, copie tout du lecteur vers l'écrivain et déplace le lecteur au début du prochain frère. |
| virtual [WriteNode](./writenode/)(SharedPtr\<XPath::XPathNavigator\>, bool) | Copie tout de l'objet XPathNavigator vers l'écrivain. La position du XPathNavigator reste inchangée. |
| virtual [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) | Lorsqu'il est remplacé dans une classe dérivée, écrit une instruction de traitement avec un espace entre le nom et le texte comme suit : **<?name text?>**. |
| virtual [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) | Lorsqu'il est remplacé dans une classe dérivée, écrit le nom qualifié par l'espace de noms. Cette méthode recherche le préfixe qui est en portée pour l'espace de noms donné. |
| virtual [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | Lorsqu'il est remplacé dans une classe dérivée, écrit du balisage brut manuellement à partir d'un tampon de caractères. |
| virtual [WriteRaw](./writeraw/)(const String\&) | Lorsqu'il est remplacé dans une classe dérivée, écrit du balisage brut manuellement à partir d'une chaîne. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&) | Écrit le début d'un attribut avec le nom local spécifié et l'URI d'espace de noms. |
| virtual [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) | Lorsqu'il est remplacé dans une classe dérivée, écrit le début d'un attribut avec le préfixe spécifié, le nom local et l'URI d'espace de noms. |
| [WriteStartAttribute](./writestartattribute/)(const String\&) | Écrit le début d'un attribut avec le nom local spécifié. |
| virtual [WriteStartDocument](./writestartdocument/)() | Lorsqu'il est remplacé dans une classe dérivée, écrit la déclaration XML avec la version "1.0". |
| virtual [WriteStartDocument](./writestartdocument/)(bool) | Lorsqu'il est remplacé dans une classe dérivée, écrit la déclaration XML avec la version "1.0" et l'attribut standalone. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&) | Lorsqu'il est remplacé dans une classe dérivée, écrit la balise de début spécifiée et l'associe à l'espace de noms fourni. |
| virtual [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) | Lorsqu'il est remplacé dans une classe dérivée, écrit la balise de début spécifiée et l'associe à l'espace de noms et au préfixe fournis. |
| [WriteStartElement](./writestartelement/)(const String\&) | Lorsqu'il est remplacé dans une classe dérivée, écrit une balise de début avec le nom local spécifié. |
| virtual [WriteString](./writestring/)(const String\&) | Lorsqu'il est remplacé dans une classe dérivée, écrit le contenu texte fourni. |
| virtual [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) | Lorsqu'il est remplacé dans une classe dérivée, génère et écrit l'entité de caractère de substitution pour la paire de caractères de substitution. |
| virtual [WriteValue](./writevalue/)(SharedPtr\<Object\>) | Écrit la valeur de l'objet. |
| virtual [WriteValue](./writevalue/)(const String\&) | Écrit une valeur [String](../../system/string/). |
| virtual [WriteValue](./writevalue/)(bool) | Écrit une valeur [Boolean](../../system/boolean/). |
| virtual [WriteValue](./writevalue/)(DateTime) | Écrit une valeur [DateTime](../../system/datetime/). |
| virtual [WriteValue](./writevalue/)(DateTimeOffset) | Écrit une valeur [DateTimeOffset](../../system/datetimeoffset/). |
| virtual [WriteValue](./writevalue/)(double) | Écrit une valeur [Double](../../system/double/). |
| virtual [WriteValue](./writevalue/)(float) | Écrit un nombre à virgule flottante simple précision. |
| virtual [WriteValue](./writevalue/)(Decimal) | Écrit une valeur [Decimal](../../system/decimal/). |
| virtual [WriteValue](./writevalue/)(int32_t) | Écrit une valeur [Int32](../../system/int32/). |
| virtual [WriteValue](./writevalue/)(int64_t) | Écrit une valeur [Int64](../../system/int64/). |
| virtual [WriteWhitespace](./writewhitespace/)(String) | Lorsqu'elle est remplacée dans une classe dérivée, écrit l'espace blanc fourni. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
