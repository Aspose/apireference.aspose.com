---
title: XbrlInstance class
second_title: Aspose.Finance for Python via .NET API References
description: 
type: docs
weight: 530
url: /python-net/aspose.finance.xbrl/xbrlinstance/
is_root: false
---

## XbrlInstance class

XBRL instance is XML fragment with root element having a xbrl tag. XBRL instance contains business report facts, with each fact corresponding to a [Concept](/finance/python-net/aspose.finance.xbrl/concept) defined in their supporting DTS. XBRL instance also contains contexts and units that provide additional information needed to interpret the facts in the instance.



The XbrlInstance type exposes the following members:

### Properties
| Property | Description |
| :- | :- |
| [contexts](/finance/python-net/aspose.finance.xbrl/xbrlinstance/contexts) | Gets or sets the collection of [Context](/finance/python-net/aspose.finance.xbrl/context) objects in the XBRL instance. |
| [facts](/finance/python-net/aspose.finance.xbrl/xbrlinstance/facts) | Gets the collection of [Fact](/finance/python-net/aspose.finance.xbrl/fact) objects in the XBRL instance. |
| [items](/finance/python-net/aspose.finance.xbrl/xbrlinstance/items) | Gets the collection of [Item](/finance/python-net/aspose.finance.xbrl/item) objects in the XBRL instance. |
| [units](/finance/python-net/aspose.finance.xbrl/xbrlinstance/units) | Gets or sets the collection of [Unit](/finance/python-net/aspose.finance.xbrl/unit) objects in the XBRL instance. |
| [footnote_links](/finance/python-net/aspose.finance.xbrl/xbrlinstance/footnote_links) | Gets or sets the collection of [FootnoteLink](/finance/python-net/aspose.finance.xbrl/footnotelink) objects in the XBRL instance. |
| [role_references](/finance/python-net/aspose.finance.xbrl/xbrlinstance/role_references) | Gets or sets the collection of [RoleReference](/finance/python-net/aspose.finance.xbrl/rolereference) objects in the XBRL instance. |
| [arcrole_references](/finance/python-net/aspose.finance.xbrl/xbrlinstance/arcrole_references) | Gets or sets the collection of [ArcroleReference](/finance/python-net/aspose.finance.xbrl/arcrolereference) objects in the XBRL instance. |
| [linkbase_ref_collection](/finance/python-net/aspose.finance.xbrl/xbrlinstance/linkbase_ref_collection) | Gets the [XbrlInstance.linkbase_ref_collection](/finance/python-net/aspose.finance.xbrl/xbrlinstance#linkbase_ref_collection) in the [XbrlInstance](/finance/python-net/aspose.finance.xbrl/xbrlinstance). |
| [linkbase_refs](/finance/python-net/aspose.finance.xbrl/xbrlinstance/linkbase_refs) | Gets  the collection of [LinkbaseRef](/finance/python-net/aspose.finance.xbrl/linkbaseref) object in the XBRL instance. |
| [schema_refs](/finance/python-net/aspose.finance.xbrl/xbrlinstance/schema_refs) | Gets the SchemaRef collection. |
| [schema_location](/finance/python-net/aspose.finance.xbrl/xbrlinstance/schema_location) | Gets or sets the schema location |
| [validation_errors](/finance/python-net/aspose.finance.xbrl/xbrlinstance/validation_errors) | Gets the collection of validation error. |
| [xbrl_document](/finance/python-net/aspose.finance.xbrl/xbrlinstance/xbrl_document) | Get the [XbrlInstance.xbrl_document](/finance/python-net/aspose.finance.xbrl/xbrlinstance#xbrl_document) which contains this instance. |


### Methods
| Method | Description |
| :- | :- |
| [get_presentation_links(role_uri, arcrole_uri)](/finance/python-net/aspose.finance.xbrl/xbrlinstance/get_presentation_links/#str-str) | Gets the presentation links in the xbrl instance. |
| [get_concept_by_id(concept_id)](/finance/python-net/aspose.finance.xbrl/xbrlinstance/get_concept_by_id/#str) | Gets the concept which has the specified id. |
| [get_concept_by_name(concept_name)](/finance/python-net/aspose.finance.xbrl/xbrlinstance/get_concept_by_name/#str) | Gets the concept which has the specified name. |
| [get_concept_by_uri_and_name(concept_uri, concept_name)](/finance/python-net/aspose.finance.xbrl/xbrlinstance/get_concept_by_uri_and_name/#str-str) | Gets the concept which has the specified uri and name. |
| [get_concept_by_loc(loc)](/finance/python-net/aspose.finance.xbrl/xbrlinstance/get_concept_by_loc/#Loc) | Gets the concept by the locator. |
| [get_role_type_by_uri(role_type_uri)](/finance/python-net/aspose.finance.xbrl/xbrlinstance/get_role_type_by_uri/#str) | Gets the RoleType which has the specified uri. |
| [get_arcrole_type_by_uri(arcrole_type_uri)](/finance/python-net/aspose.finance.xbrl/xbrlinstance/get_arcrole_type_by_uri/#str) | Gets the ArcroleType which has the specified uri. |
| [get_context_by_id(id)](/finance/python-net/aspose.finance.xbrl/xbrlinstance/get_context_by_id/#str) | Gets the context which has the specified id. |
| [get_unit_by_id(id)](/finance/python-net/aspose.finance.xbrl/xbrlinstance/get_unit_by_id/#str) | Gets the unit which has the specified id. |
| [create_element(namespace_uri, name, prefix)](/finance/python-net/aspose.finance.xbrl/xbrlinstance/create_element/#str-str-str) | Create a new element. |
| [validate()](/finance/python-net/aspose.finance.xbrl/xbrlinstance/validate/#) | Validates this XBRL instance. |
| [is_valid()](/finance/python-net/aspose.finance.xbrl/xbrlinstance/is_valid/#) | Checks whether this XBRL instance is valid. |
| [get_all_linkbase_ref_collections()](/finance/python-net/aspose.finance.xbrl/xbrlinstance/get_all_linkbase_ref_collections/#) | Get all linkbase reference collections in xbrl instance and schema references. |


### See Also

* module [aspose.finance.xbrl](../)
