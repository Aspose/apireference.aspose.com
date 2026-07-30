---
title: "classe System::Xml::XmlTextWriter"
linktitle: "XmlTextWriter"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlTextWriter. Représente un écrivain qui fournit une méthode rapide, non mise en cache, en lecture seule, pour générer des flux ou des fichiers contenant des données XML conformes aux recommandations du W3C Extensible Markup Language (XML) 1.0 et aux Namespaces in XML en C++."
type: docs
weight: 4000
url: /fr/cpp/system.xml/xmltextwriter/
---
## XmlTextWriter class


Représente un écrivain qui fournit une méthode rapide, non mise en cache, en avant uniquement pour générer des flux ou des fichiers contenant des données XML conformes à la spécification W3C Extensible Markup Language (XML) 1.0 et aux recommandations Namespaces in XML.

```cpp
class XmlTextWriter : public System::Xml::XmlWriter
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Close](./close/)() override | Ferme ce flux ainsi que le flux sous-jacent. |
| [Flush](./flush/)() override | Vide tout ce qui se trouve dans le tampon vers les flux sous-jacents et vide également le flux sous-jacent. |
| [get_BaseStream](./get_basestream/)() | Renvoie l'objet flux sous-jacent. |
| [get_Formatting](./get_formatting/)() | Indique comment la sortie est formatée. |
| [get_Indentation](./get_indentation/)() | Renvoie le nombre d'IndentChars à écrire pour chaque niveau de la hiérarchie lorsque [XmlTextWriter::set_Formatting](./set_formatting/) est défini sur [Formatting::Indented](../formatting/). |
| [get_IndentChar](./get_indentchar/)() | Renvoie le caractère à utiliser pour l'indentation lorsque [XmlTextWriter::set_Formatting](./set_formatting/) est défini sur [Formatting::Indented](../formatting/). |
| [get_Namespaces](./get_namespaces/)() | Renvoie une valeur indiquant s'il faut activer la prise en charge des espaces de noms. |
| [get_QuoteChar](./get_quotechar/)() | Renvoie le caractère à utiliser pour citer les valeurs d'attribut. |
| [get_WriteState](./get_writestate/)() override | Renvoie l'état de l'écrivain. |
| [get_XmlLang](./get_xmllang/)() override | Renvoie la portée actuelle de **xml:lang**. |
| [get_XmlSpace](./get_xmlspace/)() override | Renvoie un [XmlSpace](../xmlspace/) représentant la portée actuelle de **xml:space**. |
| [LookupPrefix](./lookupprefix/)(String) override | Renvoie le préfixe le plus proche défini dans la portée actuelle de l'espace de noms pour l'URI de l'espace de noms. |
| [set_Formatting](./set_formatting/)(System::Xml::Formatting) | Indique comment la sortie est formatée. |
| [set_Indentation](./set_indentation/)(int32_t) | Définit le nombre d'IndentChars à écrire pour chaque niveau de la hiérarchie lorsque [XmlTextWriter::set_Formatting](./set_formatting/) est défini sur [Formatting::Indented](../formatting/). |
| [set_IndentChar](./set_indentchar/)(char16_t) | Définit le caractère à utiliser pour l'indentation lorsque [XmlTextWriter::set_Formatting](./set_formatting/) est défini sur [Formatting::Indented](../formatting/). |
| [set_Namespaces](./set_namespaces/)(bool) | Définit une valeur indiquant s'il faut activer la prise en charge des espaces de noms. |
| [set_QuoteChar](./set_quotechar/)(char16_t) | Définit le caractère à utiliser pour citer les valeurs d'attribut. |
| [WriteBase64](./writebase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Encode les octets binaires spécifiés en base64 et écrit le texte résultant. |
| [WriteBinHex](./writebinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | Encode les octets binaires spécifiés en binhex et écrit le texte résultant. |
| [WriteCData](./writecdata/)(String) override | Écrit un bloc **...** contenant le texte spécifié. |
| [WriteCharEntity](./writecharentity/)(char16_t) override | Force la génération d'une entité de caractère pour la valeur Unicode spécifiée. |
| [WriteChars](./writechars/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | Écrit le texte un tampon à la fois. |
| [WriteComment](./writecomment/)(String) override | Écrit un commentaire **** contenant le texte spécifié. |
| [WriteDocType](./writedoctype/)(const String\&, const String\&, const String\&, const String\&) override | Écrit la déclaration DOCTYPE avec le nom spécifié et les attributs optionnels. |
| [WriteEndAttribute](./writeendattribute/)() override | Ferme l'appel précédent à [XmlTextWriter::WriteStartAttribute](./writestartattribute/). |
| [WriteEndDocument](./writeenddocument/)() override | Ferme tous les éléments ou attributs ouverts et remet l'écrivain à l'état Start. |
| [WriteEndElement](./writeendelement/)() override | Ferme un élément et dépile la portée d'espace de noms correspondante. |
| [WriteEntityRef](./writeentityref/)(const String\&) override | Écrit une référence d'entité sous la forme **&name**;. |
| [WriteFullEndElement](./writefullendelement/)() override | Ferme un élément et dépile la portée d'espace de noms correspondante. |
| [WriteName](./writename/)(const String\&) override | Écrit le nom spécifié, en s'assurant qu'il s'agit d'un nom valide selon la [recommandation XML 1.0 du W3C](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name). |
| [WriteNmToken](./writenmtoken/)(const String\&) override | Écrit le nom spécifié, en veillant à ce qu'il soit un **NmToken** valide selon la [recommandation W3C XML 1.0](https://www.w3.org/TR/1998/REC-xml-19980210#NT-Name). |
| [WriteProcessingInstruction](./writeprocessinginstruction/)(String, String) override | Écrit une instruction de traitement avec un espace entre le nom et le texte comme suit : **<?name text?>**. |
| [WriteQualifiedName](./writequalifiedname/)(const String\&, const String\&) override | Écrit le nom qualifié par l'espace de noms. Cette méthode recherche le préfixe qui est en portée pour l'espace de noms donné. |
| [WriteRaw](./writeraw/)(ArrayPtr\<char16_t\>, int32_t, int32_t) override | Écrit du balisage brut manuellement à partir d'un tampon de caractères. |
| [WriteRaw](./writeraw/)(const String\&) override | Écrit du balisage brut manuellement à partir d'une chaîne. |
| [WriteStartAttribute](./writestartattribute/)(const String\&, const String\&, const String\&) override | Écrit le début d'un attribut. |
| [WriteStartDocument](./writestartdocument/)() override | Écrit la déclaration XML avec la version "1.0". |
| [WriteStartDocument](./writestartdocument/)(bool) override | Écrit la déclaration XML avec la version "1.0" et l'attribut standalone. |
| [WriteStartElement](./writestartelement/)(const String\&, const String\&, const String\&) override | Écrit la balise d'ouverture spécifiée et l'associe à l'espace de noms et au préfixe fournis. |
| [WriteString](./writestring/)(const String\&) override | Écrit le contenu texte fourni. |
| [WriteSurrogateCharEntity](./writesurrogatecharentity/)(char16_t, char16_t) override | Génère et écrit l'entité de caractère de substitution pour la paire de caractères de substitution. |
| [WriteWhitespace](./writewhitespace/)(String) override | Écrit l'espace blanc fourni. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | Crée une instance de la classe [XmlTextWriter](./) en utilisant le flux et l'encodage spécifiés. |
| [XmlTextWriter](./xmltextwriter/)(const String\&, const SharedPtr\<Text::Encoding\>\&) | Crée une instance de la classe [XmlTextWriter](./) en utilisant le fichier spécifié. |
| [XmlTextWriter](./xmltextwriter/)(const SharedPtr\<IO::TextWriter\>\&) | Crée une instance de la classe [XmlTextWriter](./) en utilisant le TextWriter spécifié. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Il est recommandé d'utiliser la classe [XmlWriter](../xmlwriter/) à la place.

Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlWriter](../xmlwriter/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
