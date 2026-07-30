---
title: "Classe System::Security::SecurityElement"
linktitle: "SecurityElement"
second_title: "Aspose.Font per C++"
description: "Classe System::Security::SecurityElement. Modello di oggetto XML per la codifica di oggetti di sicurezza. Non implementato. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 300
url: /it/cpp/system.security/securityelement/
---
## SecurityElement class


Modello di oggetto XML per la codifica di oggetti di sicurezza. Non implementato. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare questo puntatore per passarlo alle funzioni come argomento.

```cpp
class SecurityElement : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddAttribute](./addattribute/)(const String\&, const String\&) | Aggiunge un attributo al tag. |
| [AddChild](./addchild/)(SecurityElement) | Aggiunge un tag figlio. |
| [Attribute](./attribute/)(const String\&) | Restituisce il valore dell'attributo. |
| [Copy](./copy/)() | Clona il tag. |
| [Equal](./equal/)(SecurityElement) | Verifica l'uguaglianza dei parametri. |
| static [Escape](./escape/)(const String\&) | Escapa i caratteri nella stringa XML. |
| static [FromString](./fromstring/)(const String\&) | Crea un elemento dal codice XML. |
| [get_Attributes](./get_attributes/)() | Restituisce gli attributi del tag. |
| [get_Children](./get_children/)() | Restituisce gli oggetti figlio del tag. |
| [get_Tag](./get_tag/)() | Restituisce il nome del tag. |
| [get_Text](./get_text/)() | Ottiene il testo interno del tag. |
| static [IsValidAttributeName](./isvalidattributename/)(const String\&) | Verifica se il nome dell'attributo è valido. |
| static [IsValidAttributeValue](./isvalidattributevalue/)(const String\&) | Verifica se il valore dell'attributo è valido. |
| static [IsValidTag](./isvalidtag/)(const String\&) | Verifica se il tag è valido. |
| static [IsValidText](./isvalidtext/)(const String\&) | Verifica se il testo è valido. |
| [SearchForChildByTag](./searchforchildbytag/)(const String\&) | Ottiene il tag figlio per nome. |
| [SearchForTextOfTag](./searchfortextoftag/)(const String\&) | Ottiene il testo interno del tag figlio per nome del tag. |
| [SecurityElement](./securityelement/)(const String\&) | Costruttore. |
| [SecurityElement](./securityelement/)(const String\&, const String\&) | Costruttore. |
| [set_Attributes](./set_attributes/)(System::Collections::Generic::Dictionary\<String, String\>) | Imposta gli attributi del tag. |
| [set_Children](./set_children/)(System::Collections::Generic::List\<SecurityElement\>) | Imposta gli oggetti figlio del tag. |
| [set_Tag](./set_tag/)(const String\&) | Imposta il nome del tag. |
| [set_Text](./set_text/)(const String\&) | Imposta il testo interno del tag. |
| [ToString](./tostring/)() const override | Converte il tag in stringa. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security](../)
* Library [Aspose.Font for C++](../../)
