<?php
namespace Freelance\FrontOfficeBundle\Form;
use Symfony\Component\Form\FormBuilderInterface;
use Symfony\Component\OptionsResolver\OptionsResolverInterface;
use Symfony\Component\Form\AbstractType;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of CandidatureForm
 *
 * @author hp
 */
class CandidatureForm extends AbstractType{
    public function buildForm(FormBuilderInterface $builder, array $options) {
        $builder
                ->add('estimation', 'text', array ('attr' => array('class' => 'required')))
                ->add('lettre_mot', 'text', array ('attr' => array('class' => 'required')))
                ->add('question', 'text', array ('attr' => array('class' => 'required')));
        
      }
    

    public function getName() {
        return "nom";
    }
    
    
    
    /**
     * @param OptionsResolverInterface $resolver
     */
    public function setDefaultOptions(OptionsResolverInterface $resolver)
    {
        $resolver->setDefaults(array(
            'data_class' => 'Freelance\FrontOfficeBundle\Entity\Candidature'
          
        )); }
    
    
}
