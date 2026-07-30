---
title: "Classe System::Web::Services::Protocols::SoapMessage"
linktitle: "SoapMessage"
second_title: "Aspose.Font pour C++"
description: "Classe System::Web::Services::Protocols::SoapMessage. Représente le message SOAP. Les objets de cette classe doivent être alloués uniquement à l'aide de la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 1000
url: /fr/cpp/system.web.services.protocols/soapmessage/
---
## SoapMessage class


Représente le message SOAP. Les objets de cette classe doivent être alloués uniquement à l'aide de la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class SoapMessage : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CollectHeaders](./collectheaders/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, SoapHeaderDirection) | Définit la collection interne des en-têtes SOAP. |
| [FindHeader](./findheader/)(System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, const TypeInfo\&) | Trouve le mappage d'en-tête par le type d'en-tête spécifié. |
| virtual [get_Action](./get_action/)() | Renvoie une valeur de l'attribut 'SOAPAction'. |
| [get_ContentEncoding](./get_contentencoding/)() | Obtient la valeur de l'en-tête 'Content-Encoding'. |
| [get_ContentType](./get_contenttype/)() | Obtient une valeur de l'en-tête 'Content-Type'. |
| [get_Exception](./get_exception/)() | Obtient l'exception qui est levée par la méthode du service XML [Web](../../system.web/). |
| [get_Headers](./get_headers/)() | Renvoie la collection des en-têtes SOAP. |
| [get_InParameters](./get_inparameters/)() | Obtient les paramètres qui sont transmis à la méthode du service XML [Web](../../system.web/). |
| [get_IsSoap12](./get_issoap12/)() | Renvoie une valeur qui indique si la version SOAP 1.2 est utilisée. |
| [get_OutParameters](./get_outparameters/)() | Obtient les paramètres de sortie transmis à la méthode du service XML [Web](../../system.web/). |
| virtual [get_SoapVersion](./get_soapversion/)() | Renvoie la version SOAP utilisée. |
| [get_Stage](./get_stage/)() | Obtient l'étape de traitement d'un message SOAP. |
| [get_Stream](./get_stream/)() | Obtient le flux qui contient les données du message SOAP. |
| virtual [get_Url](./get_url/)() | Renvoie l'URL du service XML [Web](../../system.web/). |
| [GetInParameterValue](./getinparametervalue/)(int32_t) | Obtient la valeur du paramètre d'entrée à l'index spécifié. |
| [GetOutParameterValue](./getoutparametervalue/)(int32_t) | Obtient la valeur du paramètre de sortie à l'index spécifié. |
| [GetReturnValue](./getreturnvalue/)() | Obtient la valeur de retour de la méthode du service XML [Web](../../system.web/). |
| [set_ContentEncoding](./set_contentencoding/)(String) | Définit une valeur de l'en-tête 'Content-Encoding'. |
| [set_ContentType](./set_contenttype/)(String) | Définit une valeur de l'en-tête 'Content-Type'. |
| [set_InParameters](./set_inparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Définit les paramètres qui sont transmis à la méthode du service XML [Web](../../system.web/). |
| [set_InternalStream](./set_internalstream/)(System::SharedPtr\<System::IO::Stream\>) | Définit le flux qui contient les données du message SOAP. |
| [set_OutParameters](./set_outparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Définit les paramètres de sortie transmis à la méthode du service XML [Web](../../system.web/). |
| [SetException](./setexception/)(SoapException) | Définit l'exception qui est levée par la méthode du service XML [Web](../../system.web/). |
| [SetHeaders](./setheaders/)(System::SharedPtr\<SoapHeaderCollection\>) | Définit la collection des en-têtes SOAP. |
| [SetStage](./setstage/)(SoapMessageStage) | Définit l'étape de traitement du message SOAP. |
| [SetStream](./setstream/)(System::SharedPtr\<System::IO::Stream\>) | Définit le flux qui contient les données du message SOAP. |
| [SoapMessage](./soapmessage/)() | Construit une nouvelle instance. |
| [UpdateHeaderValues](./updateheadervalues/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>) | Met à jour la collection interne des en-têtes SOAP. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
