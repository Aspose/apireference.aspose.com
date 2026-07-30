---
title: "System::Xml::Schema::XmlSchemaSimpleTypeUnion classe"
linktitle: "XmlSchemaSimpleTypeUnion"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeUnion classe. Représente l'élément **union** pour les types simples du XML Schema tel que spécifié par le World Wide Web Consortium (W3C). Un type de données **union** peut être utilisé pour spécifier le contenu d'un **simpleType**. La valeur de l'élément **simpleType** doit être l'une des données alternatives spécifiées dans l'**union**. Les types **union** sont toujours des types dérivés et doivent comprendre au moins deux types de données alternatifs en C++."
type: docs
weight: 6600
url: /fr/cpp/system.xml.schema/xmlschemasimpletypeunion/
---
## XmlSchemaSimpleTypeUnion class


Représente l'élément **union** pour les types simples du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Un type de données **union** peut être utilisé pour spécifier le contenu d'un **simpleType**. La valeur de l'élément **simpleType** doit être l'une des données alternatives spécifiées dans l'**union**. Les types **union** sont toujours des types dérivés et doivent comprendre au moins deux types de données alternatifs.

```cpp
class XmlSchemaSimpleTypeUnion : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_BaseMemberTypes](./get_basemembertypes/)() | Renvoie un tableau d'objets [XmlSchemaSimpleType](../xmlschemasimpletype/) représentant le type de l'élément **simpleType** basé sur les valeurs [XmlSchemaSimpleTypeUnion::get_BaseTypes](./get_basetypes/) et [XmlSchemaSimpleTypeUnion::get_MemberTypes](./get_membertypes/) du type simple. |
| [get_BaseTypes](./get_basetypes/)() | Renvoie la collection des types de base. |
| [get_MemberTypes](./get_membertypes/)() | Renvoie le tableau des noms de membres qualifiés des types de données intégrés ou des éléments **simpleType** définis dans ce schéma (ou un autre schéma indiqué par l'espace de noms spécifié). |
| [set_MemberTypes](./set_membertypes/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | Définit le tableau des noms de membres qualifiés des types de données intégrés ou des éléments **simpleType** définis dans ce schéma (ou un autre schéma indiqué par l'espace de noms spécifié). |
| [XmlSchemaSimpleTypeUnion](./xmlschemasimpletypeunion/)() | Initialise une nouvelle instance de la classe [XmlSchemaSimpleTypeUnion](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
