package aplicacao;

  class Jeops_RuleBase_Agente extends jeops.AbstractRuleBase {

    
    /**
     * Identifiers of rule Andar,,,,,,,
     */
    private String[] identifiers_Andar = {
        "poke",
        "p"
    };

    /**
     * Returns the identifiers declared in rule Andar
     *
     * @return the identifiers declared in rule Andar
     */
    private String[] getDeclaredIdentifiers_Andar() {
         return identifiers_Andar;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule Andar.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_Andar(int index) {
        switch (index) {
            case 0: return "aplicacao.Pokemon";
            case 1: return "aplicacao.Personagem";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule Andar.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_Andar(int index) {
        switch (index) {
            case 0: return aplicacao.Pokemon.class;
            case 1: return aplicacao.Personagem.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule Andar.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_Andar(int index, Object value) {
        switch (index) {
            case 0: this.aplicacao_Pokemon_1 = (aplicacao.Pokemon) value; break;
            case 1: this.aplicacao_Personagem_1 = (aplicacao.Personagem) value; break;
        }
    }

    /**
     * Returns an object declared in the rule Andar.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_Andar(int index) {
        switch (index) {
            case 0: return aplicacao_Pokemon_1;
            case 1: return aplicacao_Personagem_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule Andar
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_Andar() {
        return new Object[] {
                            aplicacao_Pokemon_1,
                            aplicacao_Personagem_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule Andar
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_Andar(Object[] objects) {
        aplicacao_Pokemon_1 = (aplicacao.Pokemon) objects[0];
        aplicacao_Personagem_1 = (aplicacao.Personagem) objects[1];
    }

    /**
     * Condition 0 of rule Andar.<p>
     * The original expression was:<br>
     * <code>p.nextTile()</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Andar_cond_0() {
        return (aplicacao_Personagem_1.nextTile());
    }

    /**
     * Checks whether some conditions of rule Andar is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean Andar_cond(int index) {
        switch (index) {
            case 0: return Andar_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule Andar that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_Andar(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!Andar_cond_0()) return false;
                return true;
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_Andar(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule Andar
     */
    private void Andar() {
            System.out.println("Andou");
            aplicacao_Personagem_1.andar();
            modified(aplicacao_Personagem_1);
        }



    
    /**
     * Identifiers of rule AndarAgua
     */
    private String[] identifiers_AndarAgua = {
        "poke",
        "p",
        "tm",
        "tile"
    };

    /**
     * Returns the identifiers declared in rule AndarAgua
     *
     * @return the identifiers declared in rule AndarAgua
     */
    private String[] getDeclaredIdentifiers_AndarAgua() {
         return identifiers_AndarAgua;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule AndarAgua.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_AndarAgua(int index) {
        switch (index) {
            case 0: return "aplicacao.Pokemon";
            case 1: return "aplicacao.Personagem";
            case 2: return "aplicacao.TileMap";
            case 3: return "aplicacao.Tile";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule AndarAgua.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_AndarAgua(int index) {
        switch (index) {
            case 0: return aplicacao.Pokemon.class;
            case 1: return aplicacao.Personagem.class;
            case 2: return aplicacao.TileMap.class;
            case 3: return aplicacao.Tile.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule AndarAgua.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_AndarAgua(int index, Object value) {
        switch (index) {
            case 0: this.aplicacao_Pokemon_1 = (aplicacao.Pokemon) value; break;
            case 1: this.aplicacao_Personagem_1 = (aplicacao.Personagem) value; break;
            case 2: this.aplicacao_TileMap_1 = (aplicacao.TileMap) value; break;
            case 3: this.aplicacao_Tile_1 = (aplicacao.Tile) value; break;
        }
    }

    /**
     * Returns an object declared in the rule AndarAgua.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_AndarAgua(int index) {
        switch (index) {
            case 0: return aplicacao_Pokemon_1;
            case 1: return aplicacao_Personagem_1;
            case 2: return aplicacao_TileMap_1;
            case 3: return aplicacao_Tile_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule AndarAgua
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_AndarAgua() {
        return new Object[] {
                            aplicacao_Pokemon_1,
                            aplicacao_Personagem_1,
                            aplicacao_TileMap_1,
                            aplicacao_Tile_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule AndarAgua
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_AndarAgua(Object[] objects) {
        aplicacao_Pokemon_1 = (aplicacao.Pokemon) objects[0];
        aplicacao_Personagem_1 = (aplicacao.Personagem) objects[1];
        aplicacao_TileMap_1 = (aplicacao.TileMap) objects[2];
        aplicacao_Tile_1 = (aplicacao.Tile) objects[3];
    }

    /**
     * Condition 0 of rule AndarAgua.<p>
     * The original expression was:<br>
     * <code>p.nextTile()</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarAgua_cond_0() {
        return (aplicacao_Personagem_1.nextTile());
    }

    /**
     * Condition 1 of rule AndarAgua.<p>
     * The original expression was:<br>
     * <code>p.isAgua()</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarAgua_cond_1() {
        return (aplicacao_Personagem_1.isAgua());
    }

    /**
     * Condition 2 of rule AndarAgua.<p>
     * The original expression was:<br>
     * <code>tm.getTerrenoAt(p.getPosX(), p.getPosY()) == Tile.AGUA</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarAgua_cond_2() {
        return (aplicacao_TileMap_1.getTerrenoAt(aplicacao_Personagem_1.getPosX(), aplicacao_Personagem_1.getPosY()) == Tile.AGUA);
    }

    /**
     * Checks whether some conditions of rule AndarAgua is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean AndarAgua_cond(int index) {
        switch (index) {
            case 0: return AndarAgua_cond_0();
            case 1: return AndarAgua_cond_1();
            case 2: return AndarAgua_cond_2();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule AndarAgua that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_AndarAgua(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!AndarAgua_cond_0()) return false;
                if (!AndarAgua_cond_1()) return false;
                return true;
            case 2:
                return true;
            case 3:
                return true;
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_AndarAgua(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                if (!AndarAgua_cond_2()) return false;
                return true;
            case 3:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule AndarAgua
     */
    private void AndarAgua() {
            System.out.println("Andou na agua");
            aplicacao_Personagem_1.andar();
            modified(aplicacao_Personagem_1);
        }



    
    /**
     * Identifiers of rule PegaPokebola
     */
    private String[] identifiers_PegaPokebola = {
        "poke",
        "p"
    };

    /**
     * Returns the identifiers declared in rule PegaPokebola
     *
     * @return the identifiers declared in rule PegaPokebola
     */
    private String[] getDeclaredIdentifiers_PegaPokebola() {
         return identifiers_PegaPokebola;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule PegaPokebola.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_PegaPokebola(int index) {
        switch (index) {
            case 0: return "aplicacao.Pokemon";
            case 1: return "aplicacao.Personagem";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule PegaPokebola.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_PegaPokebola(int index) {
        switch (index) {
            case 0: return aplicacao.Pokemon.class;
            case 1: return aplicacao.Personagem.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule PegaPokebola.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_PegaPokebola(int index, Object value) {
        switch (index) {
            case 0: this.aplicacao_Pokemon_1 = (aplicacao.Pokemon) value; break;
            case 1: this.aplicacao_Personagem_1 = (aplicacao.Personagem) value; break;
        }
    }

    /**
     * Returns an object declared in the rule PegaPokebola.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_PegaPokebola(int index) {
        switch (index) {
            case 0: return aplicacao_Pokemon_1;
            case 1: return aplicacao_Personagem_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule PegaPokebola
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_PegaPokebola() {
        return new Object[] {
                            aplicacao_Pokemon_1,
                            aplicacao_Personagem_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule PegaPokebola
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_PegaPokebola(Object[] objects) {
        aplicacao_Pokemon_1 = (aplicacao.Pokemon) objects[0];
        aplicacao_Personagem_1 = (aplicacao.Personagem) objects[1];
    }

    /**
     * Condition 0 of rule PegaPokebola.<p>
     * The original expression was:<br>
     * <code>p.getPokebolasTotal() < 151</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean PegaPokebola_cond_0() {
        return (aplicacao_Personagem_1.getPokebolasTotal() < 151);
    }

    /**
     * Checks whether some conditions of rule PegaPokebola is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean PegaPokebola_cond(int index) {
        switch (index) {
            case 0: return PegaPokebola_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule PegaPokebola that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_PegaPokebola(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!PegaPokebola_cond_0()) return false;
                return true;
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_PegaPokebola(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule PegaPokebola
     */
    private void PegaPokebola() {
            System.out.println("Pegou pokebolas");
            aplicacao_Personagem_1.pegarPokebolas();
            modified(aplicacao_Personagem_1);
        }



    
    /**
     * Identifiers of rule PegaPokemon
     */
    private String[] identifiers_PegaPokemon = {
        "poke",
        "p"
    };

    /**
     * Returns the identifiers declared in rule PegaPokemon
     *
     * @return the identifiers declared in rule PegaPokemon
     */
    private String[] getDeclaredIdentifiers_PegaPokemon() {
         return identifiers_PegaPokemon;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule PegaPokemon.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_PegaPokemon(int index) {
        switch (index) {
            case 0: return "aplicacao.Pokemon";
            case 1: return "aplicacao.Personagem";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule PegaPokemon.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_PegaPokemon(int index) {
        switch (index) {
            case 0: return aplicacao.Pokemon.class;
            case 1: return aplicacao.Personagem.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule PegaPokemon.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_PegaPokemon(int index, Object value) {
        switch (index) {
            case 0: this.aplicacao_Pokemon_1 = (aplicacao.Pokemon) value; break;
            case 1: this.aplicacao_Personagem_1 = (aplicacao.Personagem) value; break;
        }
    }

    /**
     * Returns an object declared in the rule PegaPokemon.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_PegaPokemon(int index) {
        switch (index) {
            case 0: return aplicacao_Pokemon_1;
            case 1: return aplicacao_Personagem_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule PegaPokemon
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_PegaPokemon() {
        return new Object[] {
                            aplicacao_Pokemon_1,
                            aplicacao_Personagem_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule PegaPokemon
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_PegaPokemon(Object[] objects) {
        aplicacao_Pokemon_1 = (aplicacao.Pokemon) objects[0];
        aplicacao_Personagem_1 = (aplicacao.Personagem) objects[1];
    }

    /**
     * Condition 0 of rule PegaPokemon.<p>
     * The original expression was:<br>
     * <code>p.getPokebolas() > 0</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean PegaPokemon_cond_0() {
        return (aplicacao_Personagem_1.getPokebolas() > 0);
    }

    /**
     * Checks whether some conditions of rule PegaPokemon is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean PegaPokemon_cond(int index) {
        switch (index) {
            case 0: return PegaPokemon_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule PegaPokemon that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_PegaPokemon(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!PegaPokemon_cond_0()) return false;
                return true;
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_PegaPokemon(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule PegaPokemon
     */
    private void PegaPokemon() {
            System.out.println("Pegou pokemons");
            aplicacao_Personagem_1.pegarPokemon(new Pokemon()); // precisa pasar um Pokemon por parametro
            modified(aplicacao_Personagem_1);
        }



    
    /**
     * Identifiers of rule RecuperaPokemons
     */
    private String[] identifiers_RecuperaPokemons = {
        "poke",
        "p"
    };

    /**
     * Returns the identifiers declared in rule RecuperaPokemons
     *
     * @return the identifiers declared in rule RecuperaPokemons
     */
    private String[] getDeclaredIdentifiers_RecuperaPokemons() {
         return identifiers_RecuperaPokemons;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule RecuperaPokemons.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_RecuperaPokemons(int index) {
        switch (index) {
            case 0: return "aplicacao.Pokemon";
            case 1: return "aplicacao.Personagem";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule RecuperaPokemons.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_RecuperaPokemons(int index) {
        switch (index) {
            case 0: return aplicacao.Pokemon.class;
            case 1: return aplicacao.Personagem.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule RecuperaPokemons.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_RecuperaPokemons(int index, Object value) {
        switch (index) {
            case 0: this.aplicacao_Pokemon_1 = (aplicacao.Pokemon) value; break;
            case 1: this.aplicacao_Personagem_1 = (aplicacao.Personagem) value; break;
        }
    }

    /**
     * Returns an object declared in the rule RecuperaPokemons.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_RecuperaPokemons(int index) {
        switch (index) {
            case 0: return aplicacao_Pokemon_1;
            case 1: return aplicacao_Personagem_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule RecuperaPokemons
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_RecuperaPokemons() {
        return new Object[] {
                            aplicacao_Pokemon_1,
                            aplicacao_Personagem_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule RecuperaPokemons
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_RecuperaPokemons(Object[] objects) {
        aplicacao_Pokemon_1 = (aplicacao.Pokemon) objects[0];
        aplicacao_Personagem_1 = (aplicacao.Personagem) objects[1];
    }

    /**
     * Condition 0 of rule RecuperaPokemons.<p>
     * The original expression was:<br>
     * <code>p.getPokemons() > 0</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean RecuperaPokemons_cond_0() {
        return (aplicacao_Personagem_1.getPokemons() > 0);
    }

    /**
     * Condition 1 of rule RecuperaPokemons.<p>
     * The original expression was:<br>
     * <code>p.getEstadoPokemons()==Personagem.FERIDOS</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean RecuperaPokemons_cond_1() {
        return (aplicacao_Personagem_1.getEstadoPokemons()==Personagem.FERIDOS);
    }

    /**
     * Checks whether some conditions of rule RecuperaPokemons is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean RecuperaPokemons_cond(int index) {
        switch (index) {
            case 0: return RecuperaPokemons_cond_0();
            case 1: return RecuperaPokemons_cond_1();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule RecuperaPokemons that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_RecuperaPokemons(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!RecuperaPokemons_cond_0()) return false;
                if (!RecuperaPokemons_cond_1()) return false;
                return true;
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_RecuperaPokemons(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule RecuperaPokemons
     */
    private void RecuperaPokemons() {
            System.out.println("Recuperou pokemons");
            aplicacao_Personagem_1.recuperarPokemon();
            modified(aplicacao_Personagem_1);
        }



    
    /**
     * Identifiers of rule VenceBatalha
     */
    private String[] identifiers_VenceBatalha = {
        "poke",
        "p"
    };

    /**
     * Returns the identifiers declared in rule VenceBatalha
     *
     * @return the identifiers declared in rule VenceBatalha
     */
    private String[] getDeclaredIdentifiers_VenceBatalha() {
         return identifiers_VenceBatalha;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule VenceBatalha.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_VenceBatalha(int index) {
        switch (index) {
            case 0: return "aplicacao.Pokemon";
            case 1: return "aplicacao.Personagem";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule VenceBatalha.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_VenceBatalha(int index) {
        switch (index) {
            case 0: return aplicacao.Pokemon.class;
            case 1: return aplicacao.Personagem.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule VenceBatalha.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_VenceBatalha(int index, Object value) {
        switch (index) {
            case 0: this.aplicacao_Pokemon_1 = (aplicacao.Pokemon) value; break;
            case 1: this.aplicacao_Personagem_1 = (aplicacao.Personagem) value; break;
        }
    }

    /**
     * Returns an object declared in the rule VenceBatalha.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_VenceBatalha(int index) {
        switch (index) {
            case 0: return aplicacao_Pokemon_1;
            case 1: return aplicacao_Personagem_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule VenceBatalha
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_VenceBatalha() {
        return new Object[] {
                            aplicacao_Pokemon_1,
                            aplicacao_Personagem_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule VenceBatalha
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_VenceBatalha(Object[] objects) {
        aplicacao_Pokemon_1 = (aplicacao.Pokemon) objects[0];
        aplicacao_Personagem_1 = (aplicacao.Personagem) objects[1];
    }

    /**
     * Condition 0 of rule VenceBatalha.<p>
     * The original expression was:<br>
     * <code>p.getEstadoPokemons()==Personagem.CURADOS</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean VenceBatalha_cond_0() {
        return (aplicacao_Personagem_1.getEstadoPokemons()==Personagem.CURADOS);
    }

    /**
     * Checks whether some conditions of rule VenceBatalha is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean VenceBatalha_cond(int index) {
        switch (index) {
            case 0: return VenceBatalha_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule VenceBatalha that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_VenceBatalha(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!VenceBatalha_cond_0()) return false;
                return true;
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_VenceBatalha(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule VenceBatalha
     */
    private void VenceBatalha() {
            System.out.println("Venceu a batalha");
            aplicacao_Personagem_1.vencerBatalha();
            modified(aplicacao_Personagem_1);
        }



    
    /**
     * Identifiers of rule PerdeBatalha
     */
    private String[] identifiers_PerdeBatalha = {
        "poke",
        "p"
    };

    /**
     * Returns the identifiers declared in rule PerdeBatalha
     *
     * @return the identifiers declared in rule PerdeBatalha
     */
    private String[] getDeclaredIdentifiers_PerdeBatalha() {
         return identifiers_PerdeBatalha;
    }

    /**
     * Returns the name of the class of one declared object for
     * rule PerdeBatalha.
     *
     * @param index the index of the declaration
     * @return the name of the class of the declared objects for
     *          this rule.
     */
    private String getDeclaredClassName_PerdeBatalha(int index) {
        switch (index) {
            case 0: return "aplicacao.Pokemon";
            case 1: return "aplicacao.Personagem";
            default: return null;
        }
    }

    /**
     * Returns the class of one declared object for rule PerdeBatalha.
     *
     * @param index the index of the declaration
     * @return the class of the declared objects for this rule.
     */
    private Class getDeclaredClass_PerdeBatalha(int index) {
        switch (index) {
            case 0: return aplicacao.Pokemon.class;
            case 1: return aplicacao.Personagem.class;
            default: return null;
        }
    }

    /**
     * Sets an object declared in the rule PerdeBatalha.
     *
     * @param index the index of the declared object
     * @param value the value of the object being set.
     */
    private void setObject_PerdeBatalha(int index, Object value) {
        switch (index) {
            case 0: this.aplicacao_Pokemon_1 = (aplicacao.Pokemon) value; break;
            case 1: this.aplicacao_Personagem_1 = (aplicacao.Personagem) value; break;
        }
    }

    /**
     * Returns an object declared in the rule PerdeBatalha.
     *
     * @param index the index of the declared object
     * @return the value of the corresponding object.
     */
    private Object getObject_PerdeBatalha(int index) {
        switch (index) {
            case 0: return aplicacao_Pokemon_1;
            case 1: return aplicacao_Personagem_1;
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations 
     * of rule PerdeBatalha
     *
     * @return an object array of the variables bound to the
     *          declarations of this rule.
     */
    private Object[] getObjects_PerdeBatalha() {
        return new Object[] {
                            aplicacao_Pokemon_1,
                            aplicacao_Personagem_1
                            };
    }

    /**
     * Defines all variables bound to the declarations 
     * of rule PerdeBatalha
     *
     * @param objects an object array of the variables bound to the
     *          declarations of this rule.
     */
    private void setObjects_PerdeBatalha(Object[] objects) {
        aplicacao_Pokemon_1 = (aplicacao.Pokemon) objects[0];
        aplicacao_Personagem_1 = (aplicacao.Personagem) objects[1];
    }

    /**
     * Condition 0 of rule PerdeBatalha.<p>
     * The original expression was:<br>
     * <code>p.getEstadoPokemons()==Personagem.FERIDOS</code>
     *
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean PerdeBatalha_cond_0() {
        return (aplicacao_Personagem_1.getEstadoPokemons()==Personagem.FERIDOS);
    }

    /**
     * Checks whether some conditions of rule PerdeBatalha is satisfied.
     *
     * @param index the index of the condition to be checked.
     * @return <code>true</code> if the condition is satisfied;
     *          <code>false</code> otherwise.
     */
    private boolean PerdeBatalha_cond(int index) {
        switch (index) {
            case 0: return PerdeBatalha_cond_0();
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of rule PerdeBatalha that depend only on
     * the given object are satisfied.
     *
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          this rule are satisfied; <code>false</code> otherwise.
     */
    private boolean checkConditionsOnlyOf_PerdeBatalha(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                if (!PerdeBatalha_cond_0()) return false;
                return true;
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference some declared element of the declarations are
     * true.
     *
     * @param declIndex the index of the declared element.
     * @return <code>true</code> if the conditions that reference
     *          up to the given declaration are true;
     *          <code>false</code> otherwise.
     */
    private boolean checkCondForDeclaration_PerdeBatalha(int declIndex) {
        switch (declIndex) {
            case 0:
                return true;
            case 1:
                return true;
            default: return false;
        }
    }

    /**
     * Executes the action part of the rule PerdeBatalha
     */
    private void PerdeBatalha() {
            System.out.println("Perdeu a batalha");
            aplicacao_Personagem_1.perderBatalha();
            modified(aplicacao_Personagem_1);
        }



    /**
     * The names of the rules in this class file
     */
    private static final String[] File_ruleNames = {
        "Andar",
        "AndarAgua",
        "PegaPokebola",
        "PegaPokemon",
        "RecuperaPokemons",
        "VenceBatalha",
        "PerdeBatalha"
    };

    /**
     * Returns the name of the rules in this class file.
     *
     * @return the name of the rules in this class file.
     */
    public String[] getRuleNames() {
        return File_ruleNames;
    }

    /**
     * The number of declarations of the rules in this class file.
     */
    private static final int[] File_numberOfDeclarations = {
        2,
        4,
        2,
        2,
        2,
        2,
        2
    };

    /**
     * Returns the number of declarations of the rules in this class file.
     *
     * @return the number of declarations  of the rules in this class file.
     */
    public int[] getNumberOfDeclarations() {
        return File_numberOfDeclarations;
    }

    /**
     * The number of conditions of the rules in this class file.
     */
    private static final int[] File_numberOfConditions = {
        1,
        3,
        1,
        1,
        2,
        1,
        1
    };

    /**
     * Returns the number of conditions of the rules in this class file.
     *
     * @return the number of conditions  of the rules in this class file.
     */
    public int[] getNumberOfConditions() {
        return File_numberOfConditions;
    }

    /**
     * Checks whether a condition of some rule is satisfied.
     *
     * @param ruleIndex the index of the rule to be checked
     * @param condIndex the index of the condition to be checked
     * @return <code>true</code> if the corresponding condition for the
     *          given rule is satisfied. <code>false</code> otherwise.
     */
    public boolean checkCondition(int ruleIndex, int condIndex) {
        switch (ruleIndex) {
            case 0: return Andar_cond(condIndex);
            case 1: return AndarAgua_cond(condIndex);
            case 2: return PegaPokebola_cond(condIndex);
            case 3: return PegaPokemon_cond(condIndex);
            case 4: return RecuperaPokemons_cond(condIndex);
            case 5: return VenceBatalha_cond(condIndex);
            case 6: return PerdeBatalha_cond(condIndex);
            default: return false;
        }
    }

    /**
     * Checks whether all conditions of some rule that depend only on
     * the given object are satisfied.
     *
     * @param ruleIndex the index of the rule to be checked
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all corresponding conditions for
     *          the given rule are satisfied;
     *           <code>false</code> otherwise.
     */
    public boolean checkConditionsOnlyOf(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return checkConditionsOnlyOf_Andar(declIndex);
            case 1: return checkConditionsOnlyOf_AndarAgua(declIndex);
            case 2: return checkConditionsOnlyOf_PegaPokebola(declIndex);
            case 3: return checkConditionsOnlyOf_PegaPokemon(declIndex);
            case 4: return checkConditionsOnlyOf_RecuperaPokemons(declIndex);
            case 5: return checkConditionsOnlyOf_VenceBatalha(declIndex);
            case 6: return checkConditionsOnlyOf_PerdeBatalha(declIndex);
            default: return false;
        }
    }

    /**
     * Checks whether all the conditions of a rule which
     * reference only the elements declared up to the given index
     * are true.
     *
     * @param ruleIndex the index of the rule to be checked
     * @param declIndex the index of the declaration to be checked
     * @return <code>true</code> if all the conditions of a rule which
     *          reference only the elements declared up to the given index
     *          are satisfied; <code>false</code> otherwise.
     */
    public boolean checkCondForDeclaration(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return checkCondForDeclaration_Andar(declIndex);
            case 1: return checkCondForDeclaration_AndarAgua(declIndex);
            case 2: return checkCondForDeclaration_PegaPokebola(declIndex);
            case 3: return checkCondForDeclaration_PegaPokemon(declIndex);
            case 4: return checkCondForDeclaration_RecuperaPokemons(declIndex);
            case 5: return checkCondForDeclaration_VenceBatalha(declIndex);
            case 6: return checkCondForDeclaration_PerdeBatalha(declIndex);
            default: return false;
        }
    }

    /**
     * Returns the class name of an object declared in a rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration
     * @return the class name of the declared object.
     */
    public String getDeclaredClassName(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredClassName_Andar(declIndex);
            case 1: return getDeclaredClassName_AndarAgua(declIndex);
            case 2: return getDeclaredClassName_PegaPokebola(declIndex);
            case 3: return getDeclaredClassName_PegaPokemon(declIndex);
            case 4: return getDeclaredClassName_RecuperaPokemons(declIndex);
            case 5: return getDeclaredClassName_VenceBatalha(declIndex);
            case 6: return getDeclaredClassName_PerdeBatalha(declIndex);
            default: return null;
        }
    }

    /**
     * Returns the class of an object declared in a rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration
     * @return the class of the declared object.
     */
    public Class getDeclaredClass(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredClass_Andar(declIndex);
            case 1: return getDeclaredClass_AndarAgua(declIndex);
            case 2: return getDeclaredClass_PegaPokebola(declIndex);
            case 3: return getDeclaredClass_PegaPokemon(declIndex);
            case 4: return getDeclaredClass_RecuperaPokemons(declIndex);
            case 5: return getDeclaredClass_VenceBatalha(declIndex);
            case 6: return getDeclaredClass_PerdeBatalha(declIndex);
            default: return null;
        }
    }

    /**
     * Fires one of the rules in this rule base.
     *
     * @param ruleIndex the index of the rule to be fired
     */
    protected void internalFireRule(int ruleIndex) {
        switch (ruleIndex) {
            case 0: Andar(); break;
            case 1: AndarAgua(); break;
            case 2: PegaPokebola(); break;
            case 3: PegaPokemon(); break;
            case 4: RecuperaPokemons(); break;
            case 5: VenceBatalha(); break;
            case 6: PerdeBatalha(); break;
        }
    }

    /**
     * Returns the number of rules.
     *
     * @return the number of rules.
     */
    public int getNumberOfRules() {
        return 7;
    }

    /**
     * Returns the identifiers declared in a given rule.
     *
     * @param ruleIndex the index of the rule.
     * @return an array with the identifiers of the rule declarations.
     */
    public String[] getDeclaredIdentifiers(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getDeclaredIdentifiers_Andar();
            case 1: return getDeclaredIdentifiers_AndarAgua();
            case 2: return getDeclaredIdentifiers_PegaPokebola();
            case 3: return getDeclaredIdentifiers_PegaPokemon();
            case 4: return getDeclaredIdentifiers_RecuperaPokemons();
            case 5: return getDeclaredIdentifiers_VenceBatalha();
            case 6: return getDeclaredIdentifiers_PerdeBatalha();
            default: return new String[0];
        }
    }

    /**
     * Sets an object that represents a declaration of some rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration in the rule.
     * @param value the value of the object being set.
     */
    public void setObject(int ruleIndex, int declIndex, Object value) {
        switch (ruleIndex) {
            case 0: setObject_Andar(declIndex, value); break;
            case 1: setObject_AndarAgua(declIndex, value); break;
            case 2: setObject_PegaPokebola(declIndex, value); break;
            case 3: setObject_PegaPokemon(declIndex, value); break;
            case 4: setObject_RecuperaPokemons(declIndex, value); break;
            case 5: setObject_VenceBatalha(declIndex, value); break;
            case 6: setObject_PerdeBatalha(declIndex, value); break;
        }
    }

    /**
     * Returns an object that represents a declaration of some rule.
     *
     * @param ruleIndex the index of the rule
     * @param declIndex the index of the declaration in the rule.
     * @return the value of the corresponding object.
     */
    public Object getObject(int ruleIndex, int declIndex) {
        switch (ruleIndex) {
            case 0: return getObject_Andar(declIndex);
            case 1: return getObject_AndarAgua(declIndex);
            case 2: return getObject_PegaPokebola(declIndex);
            case 3: return getObject_PegaPokemon(declIndex);
            case 4: return getObject_RecuperaPokemons(declIndex);
            case 5: return getObject_VenceBatalha(declIndex);
            case 6: return getObject_PerdeBatalha(declIndex);
            default: return null;
        }
    }

    /**
     * Returns all variables bound to the declarations of
     * some rule.
     *
     * @param ruleIndex the index of the rule
     * @return an object array of the variables bound to the
     *          declarations of some rule.
     */
    public Object[] getObjects(int ruleIndex) {
        switch (ruleIndex) {
            case 0: return getObjects_Andar();
            case 1: return getObjects_AndarAgua();
            case 2: return getObjects_PegaPokebola();
            case 3: return getObjects_PegaPokemon();
            case 4: return getObjects_RecuperaPokemons();
            case 5: return getObjects_VenceBatalha();
            case 6: return getObjects_PerdeBatalha();
            default: return null;
        }
    }
    /**
     * Defines all variables bound to the declarations of
     * some rule.
     *
     * @param ruleIndex the index of the rule
     * @param objects an object array of the variables bound to the
     *          declarations of some rule.
     */
    public void setObjects(int ruleIndex, Object[] objects) {
        switch (ruleIndex) {
            case 0: setObjects_Andar(objects); break;
            case 1: setObjects_AndarAgua(objects); break;
            case 2: setObjects_PegaPokebola(objects); break;
            case 3: setObjects_PegaPokemon(objects); break;
            case 4: setObjects_RecuperaPokemons(objects); break;
            case 5: setObjects_VenceBatalha(objects); break;
            case 6: setObjects_PerdeBatalha(objects); break;
        }
    }

    /*
     * The variables declared in the rules.
     */
    private aplicacao.Pokemon aplicacao_Pokemon_1;
    private aplicacao.Personagem aplicacao_Personagem_1;
    private aplicacao.TileMap aplicacao_TileMap_1;
    private aplicacao.Tile aplicacao_Tile_1;

    /**
     * Class constructor.
     *
     * @param knowledgeBase the knowledge base that contains this rule base.
     */
    public Jeops_RuleBase_Agente(jeops.AbstractKnowledgeBase knowledgeBase) {
        super(knowledgeBase);
    }

}
/**
 * Knowledge base created by JEOPS from file aplicacao/Agente.rules
 *
 * @version 23/05/2017
 */
public class Agente extends jeops.AbstractKnowledgeBase {

    /**
     * Creates a new knowledge base with the specified conflict set with the
     * desired conflict resolution policy.
     *
     * @param conflictSet a conflict set with the desired resolution policy
     */
    public Agente(jeops.conflict.ConflictSet conflictSet) {
        super(conflictSet);
    }

    /**
     * Creates a new knowledge base, using the default conflict resolution
     * policy.
     */
    public Agente() {
        this(new jeops.conflict.DefaultConflictSet());
    }

    /**
     * Factory method used to instantiate the rule base.
     */
    protected jeops.AbstractRuleBase createRuleBase() {
        return new Jeops_RuleBase_Agente(this);
    }

}
