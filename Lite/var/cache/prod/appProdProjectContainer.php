<?php

// This file has been auto-generated by the Symfony Dependency Injection Component for internal use.

if (\class_exists(\ContainerPn3ayk7\appProdProjectContainer::class, false)) {
    // no-op
} elseif (!include __DIR__.'/ContainerPn3ayk7/appProdProjectContainer.php') {
    touch(__DIR__.'/ContainerPn3ayk7.legacy');

    return;
}

if (!\class_exists(appProdProjectContainer::class, false)) {
    \class_alias(\ContainerPn3ayk7\appProdProjectContainer::class, appProdProjectContainer::class, false);
}

return new \ContainerPn3ayk7\appProdProjectContainer(array(
    'container.build_hash' => 'Pn3ayk7',
    'container.build_id' => '5ffda435',
    'container.build_time' => 1570352354,
), __DIR__.\DIRECTORY_SEPARATOR.'ContainerPn3ayk7');
