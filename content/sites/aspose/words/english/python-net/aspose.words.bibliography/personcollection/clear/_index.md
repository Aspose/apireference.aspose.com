﻿---
title: PersonCollection.clear method
linktitle: clear method
articleTitle: clear method
second_title: Aspose.Words for Python
description: "PersonCollection.clear method. Removes all items from the collection."
type: docs
weight: 50
url: /python-net/aspose.words.bibliography/personcollection/clear/
---

## clear() {#default}

Removes all items from the collection.


```python
def clear(self):
    ...
```

### Examples

Shows how to work with person collection.

```python
# Create a new person collection.
persons = aw.bibliography.PersonCollection()
person = aw.bibliography.Person('Roxanne', 'Brielle', 'Tejeda_updated')
# Add new person to the collection.
persons.add(person)
self.assertEqual(1, persons.count)
# Remove person from the collection if it exists.
if persons.contains(person):
    persons.remove(person)
self.assertEqual(0, persons.count)
# Create person collection with two persons.
persons = aw.bibliography.PersonCollection(persons=[aw.bibliography.Person('Roxanne_1', 'Brielle_1', 'Tejeda_1'), aw.bibliography.Person('Roxanne_2', 'Brielle_2', 'Tejeda_2')])
self.assertEqual(2, persons.count)
# Remove person from the collection by the index.
persons.remove_at(0)
self.assertEqual(1, persons.count)
# Remove all persons from the collection.
persons.clear()
self.assertEqual(0, persons.count)
```

### See Also

* module [aspose.words.bibliography](../../)
* class [PersonCollection](../)

